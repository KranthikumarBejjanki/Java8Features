package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//using both filter and MAP
class Employee{
    String empname;
    int empid;
    int salary;

    Employee(String ename, int id, int sal){
        this.empname=ename;
        this.empid=id;
        this.salary=sal;
    }
}

public class MapDemo04 {
    public static void main(String[] args) {
       /* List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Alex", 101, 10000));
        employees.add(new Employee("Anton", 102, 30000));
        employees.add(new Employee("Scott", 103, 40000));
        employees.add(new Employee("Matt", 104, 50000));*/

        //or

        List<Employee> employees = Arrays.asList(new Employee("Alex", 101, 10000),
                new Employee("Anton", 102, 30000),
                new Employee("Scott", 103, 40000),
                new Employee("Matt", 104, 50000)
                );

        List<Integer> target =employees.stream().filter(n-> n.salary>20000).map(n-> n.salary).collect(Collectors.toList());
        System.out.println(target
        );

    }
}
