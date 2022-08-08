package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo01 {
    public static void main(String[] args){
        HashSet hs = new HashSet();  // Default capacity is 16 & Load factor is 0.75
        HashSet hsd =  new HashSet(100, (float)0.95);
        HashSet<String> hs1 = new HashSet<String>();

        hs.add("Kranthikumar");
        hs.add(125);
        hs.add(0.01);
        hs.add(true);
        hs.add('A');
        hs.add(null);

        System.out.println(hs);
        hs.remove(0.01);
        System.out.println("After removing value: "+hs);

        System.out.println(hs.contains(0.01));
        System.out.println(hs.isEmpty());

        //reading elemtnts

        for(Object obj:hs){
            System.out.println(obj);
        }

        Iterator ite = hs.iterator();
       while(ite.hasNext()){
           System.out.println("Through Iterator :"+ite.next());
       }

        hs1.add("abcs");
        hs1.add("123123");
        hs1.add("svsda");
        hs1.add("csac");

        hs1.addAll(hs);
        System.out.println(hs1);

        //removeAll




    }
}
