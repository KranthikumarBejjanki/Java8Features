package lamdaExpressions;

@FunctionalInterface
interface Cab
{
    public void bookCab();
}

/*class Ola implements Cab
{
    public void bookCab() {
        System.out.println("OLA CAB IS BOOKED ...");
    }
}*/
public class Test {
    public static void main(String[] args) {
        Cab cab =  ()->System.out.println("OLA CAB IS BOOKED ...");
        cab.bookCab();
    }
}
