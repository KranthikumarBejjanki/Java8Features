package lamdaExpressions;

interface Cab3{
    public String bookCab(String source, String destination);
}

public class test3 {
    public static void main(String[] args) {
        Cab3 cab = (source, destination) -> {
            System.out.println("cab is booked from " + source + " to "+ destination);
            return ("price is  5000rs");

        };
        System.out.println(cab.bookCab("hyderbad", "Vizag"));
    }
}
