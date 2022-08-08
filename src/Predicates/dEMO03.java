package Predicates;

import java.util.function.Predicate;

//Joining Predicates - and, or, negate
//p1  -- checks if number is even
// p2 -- checks if number is >50
public class dEMO03 {
    public static void main(String[] args) {

        int a[] = {5,15,20,25,30,35,40,45,50,55,60,65};

        Predicate<Integer> pr1 = i -> i%2==0;

        Predicate<Integer> pr2 = i -> i>50;

        //AND
        System.out.println("AND condition values");
        for (int number:
             a) {
           if(pr1.and(pr2).test(number)){   // pr1.test(number) && pr2.test(number)
               System.out.println(number);
           }
        }

        //OR
        System.out.println("OR condition values");
        for (int number:
                a) {
            if(pr1.or(pr2).test(number)){   // pr1.test(number) || pr2.test(number)
                System.out.println(number);
            }
        }

        //Negate
        System.out.println("Negate condition ::");
        for (int number:
                a) {
            if(pr1.negate().test(number)){   // opposite
                System.out.println(number);
            }
        }

    }
}
