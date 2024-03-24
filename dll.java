class dll{
    Node head=null;
    class Node{
        int data;
        Node next,prev;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }
    public static void main(String args[]){
        dll d=new dll();
        d.iFront(10);
        d.iFront(20);
        d.iEnd(40);
        d.iMiddle(30,3);
        d.display();
        d.dFront();
        d.dEnd();
        d.dMiddle(2);
        d.display();
    }
    void display(){
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(temp.next!=null){
                System.out.print(temp.data+"");
                temp=temp.next;
            }
            System.out.print(temp.data);
        }
    }
        void iFront(int data){
            Node nn=new Node(data);
            if(head==null){
                head=nn;
            }
            else{
                nn.next=head;
                head.prev=nn;
                head=nn;
            }
        }
        void iEnd(int data){
            Node nn=new Node(data);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
            nn.prev=temp;
        }
        void iMiddle(int data,int pos){
            Node nn=new Node(data);
            Node temp=head;
            if(pos<1){
                System.out.print("invalid");
            }
            else{
                for(int i=1;i<(pos-1);i++){
                temp=temp.next;    
                }
                nn.next=temp.next;
                nn.prev=temp;
                temp.next=nn;
                temp=nn;
            }
        }
            void dFront(){
                Node temp=head;
                head=temp.next;
                head.prev=null;
                temp=null;
            }
            void dEnd(){
                Node temp=head;
                Node temp1=null;
                while(temp.next!=null){
                    temp1=temp;
                    temp=temp.next;
                }
                temp=null;
                temp1.next=null;
            }
            void dMiddle(int pos){
                Node temp=head;
                Node temp1=temp.next;
                if(pos<1){
                    System.out.print("invslid");
                }
                else{
                    for(int i=1;i<(pos-1);i++){
                        temp=temp1;
                        temp1=temp1.next;
                    }
                    temp.next=temp1.next;
                    temp1=null;
                }
            }
        }