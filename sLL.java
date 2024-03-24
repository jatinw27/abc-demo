class sLL{
    Node head=null;
    class Node{
        int data;
        Node next;
    
    Node(int d){
        data=d;
        next=null;
    }
}
    public static void main(String ar[]){
        sLL s= new sLL();
        s.iFront(20);
        s.iFront(30);
        s.iEnd(50);
        s.iMiddle(40,2);
        s.display();
        s.dFront();
        s.dEnd();
        s.dMiddle(2);
        s.display();
    }
    void display(){
        if(head==null){
            System.out.print("list is empty");
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data);
        }
    }
    void iFront(int data){
        Node nn=new Node(data);
        Node temp=head;
        if(head==null){
            head=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }
    void iEnd(int data){
        Node nn=new Node(data);
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=nn;
        temp=nn;
    }
    void iMiddle(int data, int pos){
        Node nn=new Node(data);
        if (pos<1) {
            System.out.println("not valid");
        }
        else{
            Node temp=head;
            for(int i=1;i<(pos-1);i++){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
    }
    void dFront(){
        Node temp=head;
        head=head.next;
        temp=null;
    }
    void dEnd(){
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }
    void dMiddle(int pos){
        if (pos<1) {
            System.out.println("not valid");
        }
        else{
            Node temp=head;
            Node temp1=temp.next;
            for(int i=1;i<(pos-1);i++){
                temp1=temp1.next;
            }
            temp.next=temp1.next;
            temp1=null;
        }
    }
}