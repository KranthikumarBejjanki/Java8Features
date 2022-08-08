package functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;

    Employee(String name, int sal){
        this.ename=name;
        this.salary= sal;
    }
}

public class Demo02 {
    public static void main(String[] args) {

        ArrayList<Employee> emplList = new ArrayList<Employee>();
        emplList.add(new Employee("David",50000));
        emplList.add(new Employee("scott",30000));
        emplList.add(new Employee("anton",20000));

        Function<Employee, Integer> fn= e->{
            int sal1 =e.salary;
            if(sal1>10000 && sal1<20000)
                return (sal1*10/100);
            else if(sal1>20000 && sal1<30000)
                return (sal1*20/100);
            else if(sal1>30000 && sal1<50000)
                return (sal1*30/100);
            else
                return (sal1*40/100);
        };

        Predicate<Integer> p = b->b>5000;

        for (Employee e:emplList
             ) {
            int bonus = fn.apply(e);
            if(p.test(bonus)){
                System.out.println(e.ename+ " "+e.salary);
                System.out.println("Eligible bonus is "+ bonus);
            }


        }

    }
}
