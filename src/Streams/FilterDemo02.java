package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo02 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("David", "Kranthi", "Anton", "Scott");
        List<String> names1 = new ArrayList<String>();

        names.stream().filter(s->s.length()>6 && s.length()<8).forEach(System.out::println);

        names1=names.stream().filter(s->s.length()>6 && s.length()<8).collect(Collectors.toList());
        System.out.println(names1);


    }
}
