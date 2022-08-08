package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo03 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Cup", null, "forest", "sky", null, "book");

        List<String> result = new ArrayList<String>();

        result= words.stream().filter(w->w!=null).collect(Collectors.toList());
        System.out.println(result);
    }
}
