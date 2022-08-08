package consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    String gender;

    Employee(String name, int sal, String sex){
        this.ename= name;
        this.salary=sal;
        this.gender=sex;
    }
}

public class Demo02 {
    public static void main(String[] args) {

        ArrayList emplList = new ArrayList();
        emplList.add(new Employee("David", 50000, "Male"));
        emplList.add(new Employee("Anton", 40000, "Male"));
        emplList.add(new Employee("Shruthi", 30000, "FeMale"));
        emplList.add(new Employee("Kranthi", 20000, "Male"));

        //Function
        Function<Employee, Integer> fn= e-> (e.salary*10)/100;

        //Predicate
        Predicate<Integer> p = b-> b>5000;

        //Consumer
        Consumer<Employee> c = emp->{
            System.out.println(emp.ename);
            System.out.println(emp.salary);
            System.out.println(emp.gender);

        };

        for (Object em:emplList
        ) {
            int bonus = fn.apply((Employee) em);
            if(p.test(bonus)){
                c.accept((Employee) em);
                System.out.println(bonus);
            }

        }


    }

    //consumer chaining c1.andThen(c2).andThen(c3).accept("String value")
}
