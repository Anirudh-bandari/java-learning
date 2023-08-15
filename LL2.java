public class LL2 {
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
        Node newNode= new Node(d);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;

        }
    }
    public int count(){
        Node current=head;
        int Count=0;
        while(current!=null){
            current=current.next;
            Count++;

        }
        return Count;
    }

    public static void main(String[] args) {
        LL2 list=new LL2();

        list.addNode(100);
        list.addNode(200);
        System.out.println(list.count());

    }
}
