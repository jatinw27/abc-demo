class scll{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static void main(String args[]){
        scll s=new scll();
        s.iFront(10);
        s.iFront(20);
        s.iEnd(40);
        s.iMiddle(30,3);
        s.display();
        s.dFront();
        s.dEnd();
        s.dMiddle(2);
        s.display();
    }
    void display(){
        if(head==null){
            System.out.print("empty");
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                System.out.print(temp.data+"");
                temp=temp.next;
            }
    }
}
    void iFront(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            nn.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=nn;
            nn.next=head;
            head=nn;
        }
    }
    void iEnd(int data){
        Node temp=head;
        Node nn= new Node(data);
        while(temp.next!=head){
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
        temp=nn;
    }
    void iMiddle(int data, int pos){
        Node nn=new Node(data);
            Node temp=head;
            for(int i=1;i<(pos-1);i++){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
    void dFront(){
        Node temp=head;
        Node tail=head;
        while(tail.next!=head){
            tail=tail.next;
        }
        temp=temp.next;
        head=temp;
        tail.next=head;
    }
    void dEnd(){
        Node temp=head;
        Node temp1=temp.next;
        while(temp1.next!=head){
            temp=temp1;
            temp1=temp1.next;
        }
        temp.next=head;
        temp1=null;
    }
    void dMiddle(int pos){
        if(pos<1){
            System.out.print("");
        }
        else{
            Node temp=head;
            Node temp1=temp.next;
            for(int i=1;i<(pos-1);i++){
                temp=temp.next;
            }
            temp.next=temp1.next;
            temp1=null;
        }
    }
}
