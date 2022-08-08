package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo03 {
    public static void main(String[] args){
        String array[] = {"Dog", "Cat", "Elephant"};

        for(String s: array){
            System.out.println(s);
        }

       // convert Array to ArrayList
        ArrayList al = new ArrayList(Arrays.asList(array));
        System.out.println(al);


    }
}
