import java.util.Scanner;
public class endInsertion {

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            this.next=null;
        }

    }
    public Node head;
    public Node tail;
    public void addData(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }


    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }

    }
    public void delete(int d){
        int count=0;
        Node current=head;
        Node current2=head;
        Node temp;
        for(int i=0;i<=d;i++){
            current=current.next;
        }
        temp=current;
        for(int i=0;i<d;i++){
            current2=current2.next;

        }
        current2=temp;
        System.out.println(current2.data);

    }


    public static void main(String[] args) {
        endInsertion list=new endInsertion();
        list.addData(100);
        list.addData(3);
        list.addData(4);
        list.addData(48);
        list.addData(7);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you eant to add in linked LIst");
        int n=scanner.nextInt();
        list.addData(n);
        System.out.println("Enter thge number which you weant to add first");
        int p=scanner.nextInt();
        Node third=new Node(p);
        third.next=list.head;
        list.head=third;
        list.display();
        System.out.println("Enter the node which you want to delete");
        int d=scanner.nextInt();
        list.delete(d);
        list.display();
    }
}