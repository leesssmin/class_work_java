package my;

import com._static.Employee;

public class Static_Company {

    static int empSerialNumber =1;

    public static void main(String[] args) {

        Employee employee1 = new Employee("a");
        Employee employee2 = new Employee("b");
        Employee employee3 = new Employee("c");

        System.out.println("a :" + employee1.getEmployeeId());
        System.out.println("b :" + employee2.getEmployeeId());
    }
}
