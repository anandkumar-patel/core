package anand.util.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMethod {
    public static void main(String[] args) {
        Address add1 = new Address(222201,"Street1");
        Address add2 = new Address(222203,"Street2");
        Address add3 = new Address(222202,"Street3");
        Address add4 = new Address(222205,"Street4");
        Address add5 = new Address(222204,"Street5");

        Employee e1 = new Employee(11,21,"Anand",add1);
        Employee e2 = new Employee(14,23,"Kumar",add4);
        Employee e3 = new Employee(13,22,"patel",add5);
        Employee e4 = new Employee(12,20,"Uday",add3);
        Employee e5 = new Employee(10,12,"Raj",add2);

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        System.out.println("Unsorted list : "+empList);

        Collections.sort(empList, new AgeComparator());
        System.out.println("Sorted list{ by age} : "+empList);

        Collections.sort(empList, new NameComparator());
        System.out.println("Sorted list{ by name} : "+empList);
    }
}
