package collectiondemos;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo01 {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add(100);
        l.add("Welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);
        System.out.println(l);
        System.out.println(l.size());

        l.remove(3);
        System.out.println("After removing:" +l);

        l.remove(15.5);
        System.out.println(l);

        l.add(2,"Kranthikumar");
        System.out.println(l);

        System.out.println(l.get(2));
        System.out.println(l.set(2,"testing"));

        System.out.println(l.contains("java"));
        System.out.println(l.contains("testing"));
        System.out.println(l.isEmpty());


        //reading elements using for loop
        for(Object obg:l){
            System.out.println("Through for each loop :"+ obg);
        }

        //using Iterator
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //add all l2.adAll(l);
        //remove all l2.removeAll(l);
        //sort Collections.sort(l);
        //reverse Collections.sort(l, Collections.reverseOrder());
        //Shuffle Collections.shuffle(l);

//Specific methods of Linked list to deal with Stack and Queues

        l.addFirst(001);
        l.addLast(002);
        System.out.println(l);

        l.removeFirst();
        l.removeLast();
        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());

    }
}
