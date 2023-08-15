public class LinkedList1{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;

            }
            current.next=newNode;
        }



    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"\n");
            current=current.next;
        }
//        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList1 list=new LinkedList1();

        list.addNode(100);
        list.addNode(200);
        list.addNode(300);

        list.display();


    }



}