package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args){
        ArrayList al =  new ArrayList();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        List al3 = new ArrayList();

        al.add(100);
        al.add("Kranthi");
        al.add(true);

        System.out.println(al);

        System.out.println("Size od array list is : "+al.size());

        al.remove(2);
        System.out.println(al);

        al.add(1, "kumar");
        System.out.println(al);

        al.get(1);
        System.out.println(al);

        al.set(1, "Kranthikumar");
        System.out.println(al);

        System.out.println(al.contains("kranthi"));
        System.out.println(al.contains(100));
        System.out.println(al.isEmpty());
        System.out.println("Using for each********************");
        for(Object obj:al){
            System.out.println(obj);
        }
        System.out.println("Using Iterator********************");
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
