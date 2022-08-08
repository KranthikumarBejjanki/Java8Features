package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// lenght of the element and store in other collection
public class MapDemo02 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("David", "Kranthi", "Anton", "Scott");
        List<Integer> size = new ArrayList<Integer>();

        //before java 8
        for (String name:names
             ) {
            int sizeOfElement=name.length();
            System.out.println(sizeOfElement);
        }

        //after java 8
        //size=names.stream().map(s-> s.length()).collect(Collectors.toList());

        names.stream().map(s-> s.length()).forEach(System.out::println);

        //System.out.println(size);
    }
}
