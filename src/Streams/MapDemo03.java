package Streams;

import java.util.Arrays;
import java.util.List;


//read every vallue and multiply by 3 and store the result in other  collection
public class MapDemo03 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(2,3,4,5);

        numbersList.stream().map(n->n*3).forEach(System.out::println);
    }
}
