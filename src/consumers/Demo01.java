package consumers;

import java.util.function.Consumer;

public class Demo01 {
    public static void main(String[] args) {
        Consumer<String> c = s-> System.out.println(s);
        c.accept("Welcome");
    }
}
