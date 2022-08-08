package Streams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo01 {
    public static void main(String[] args) {
       /* ArrayList<Integer> numbers = new ArrayList();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);*/

        List<Integer> numebrsList= Arrays.asList(10,15,20,25,30);
        List<Integer> evenNumbersList = new ArrayList<Integer>();

        //without using streams
        /*for (int n:numebrsList
             ) {
            if(n%2==0){
                evenNumbersList.add(n);
            }
        }
        System.out.println(evenNumbersList);*/

        //with Streams

        evenNumbersList = numebrsList.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbersList);

        //other way
        numebrsList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

        // other way
        numebrsList.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
