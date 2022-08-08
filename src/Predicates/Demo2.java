package Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String ename;
    int salary;
    int experience;

    Employee(String name,
             int sal,
             int exp) {
        ename = name;
        salary = sal;
        experience = exp;
    }
}

public class Demo2 {
    public static void main(String[] args) {
    //ex1
        Employee emp = new Employee("Kranthi", 50000, 5);
        Predicate<Employee> pr = e -> (e.salary>30000 && e.experience>3);
        System.out.println(pr.test(emp));

        //ex2

        ArrayList<Employee> al = new ArrayList<Employee>();

        al.add(new Employee("Kranthi", 50000, 5));
        al.add(new Employee("David", 30000, 3));
        al.add(new Employee("Jhon", 20000, 2));
        al.add(new Employee("Scott", 40000, 6));

        for(Employee e:al){
            if(pr.test(e)){
                System.out.println(e.ename+ " " + e.salary);
            }
        }


    }
}
