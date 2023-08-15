import java.util.*;
public class CollectionFrameWorks {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("My");
        list.add("Name");
        list.add("is");
        list.add("Anirudh");

        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        list.removeLast();
        list.remove(2);
        System.out.println(list);



    }
}
