package Predicates;

import java.util.function.Predicate;

// USe predicate only when we have comditional checks and one paramter and returns boolean value


public class Demo1 {
    public static void main(String[] args) {

        //Ex1 check if gievn number is greater than 10
        Predicate<Integer> p = i -> (i>10);

        System.out.println( p.test(20));
        System.out.println( p.test(3));

        //Ex2 check if length of string is more than 4 characters
        Predicate<String> p1 = s-> (s.length()>4);
        System.out.println(p1.test("Kranthi"));

        //Ex3  Print array elemnts whose size is >4

        String names[] = {"David", "Scott", "smith", "Jhon", "Mary"};

        for(String name:names){
            if(p1.test(name)){
                System.out.println(name);
            }
        }
    }
}
