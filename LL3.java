import java.sql.SQLOutput;

public class LL3 {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void addNode(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;

        }
    }
    public void reverse(){

    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;

        }

    }
    public static void main(String[] args) {
        LL3 list=new LL3();
         list.addNode(100);
         list.addNode(200);
         list.addNode(300);

        list.display();


    }

}
