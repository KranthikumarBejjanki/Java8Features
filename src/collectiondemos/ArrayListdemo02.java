package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListdemo02 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al1 = new ArrayList();
        al1.add("dads");
        al1.add("asda");
        al1.add("asda");
        al1.addAll(al);
        System.out.println("new list is:" + al1);
       // al1.removeAll(al);
       // System.out.println("new list after removing:" + al1);

        //sort --- using Collections class

        Collections.sort(al);
        System.out.println("After Sorting" + al);

        //reverse  order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After Sorting in reverse order" + al);

        //shuffling
        Collections.shuffle(al);
        System.out.println("After shuffling" + al);

    }
}
