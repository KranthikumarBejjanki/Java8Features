package lamdaExpressions;

interface Cab1
{
    public void bookCab(String source, String destination);
}


public class test2 {
    public static void main(String[] args) {
    Cab1 cab = ((source, destination) -> System.out.println("cab is booked from "+ source+ " to "+ destination));
    cab.bookCab("Hyderabad", "Vizag");
    }
}
