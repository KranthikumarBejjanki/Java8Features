package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

// convert every elemnt into upper case and store in  target
public class MapDemo01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("David", "Kranthi", "Anton", "Scott");

        List<String> namesUpperCase = new ArrayList<String>();

        //without streams
       /* for (String s:names
             ) {
            namesUpperCase.add(s.toUpperCase());
        }
        System.out.println("New list with uppercase: "+ namesUpperCase);*/

        //with streams-map
        namesUpperCase=names.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(namesUpperCase);
    }
}
