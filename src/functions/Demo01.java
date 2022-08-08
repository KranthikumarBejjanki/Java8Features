package functions;

import java.util.function.Function;

public class Demo01 {
    public static void main(String[] args) {

        //
        Function<Integer, Integer> f = i-> i*i;
        System.out.println(f.apply(4));

        //find string length

        Function<String, Integer> f1 = s-> s.length();
        System.out.println(f1.apply("Kranthikumar"));

    }
}
