/**
 * Create by saurabh
 * Date: 11/11/23
 * Project Name: Java-8
 */
package predicate.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ramesh",26,"Oracle","SDE1","Java","Pune"));
        employeeList.add(new Employee("Mukesh",26,"Oracle","SDE1","Java","Bangalore"));
        employeeList.add(new Employee("Sunil",26,"TIAA","SDE1","Java","Bangalore"));
        employeeList.add(new Employee("Ravindra",26,"Oracle","SDE1","Java","Bangalore"));
        employeeList.add(new Employee("Neha",26,"Microsoft","SDM","Java","Texas"));
        employeeList.add(new Employee("KK",26,"Amazon","SDE1","Java","Pune"));
        employeeList.add(new Employee("Arun",26,"TESCO","SDE1","Java","Bangalore"));
        employeeList.add(new Employee("Rohit",26,"Oracle","SDE1","Java","Bangalore"));
        employeeList.add(new Employee("Mayank",26,"Oracle","SDE1","Java","Bangalore"));
        employeeList.add(new Employee("Rahul",26,"BHEL","SDE1","Java","Noida"));
        employeeList.add(new Employee("Darshan",26,"EY","SDE1","Java","Noida"));
        //list all Pune employee
        Predicate<Employee> employeePredicatePune = employee -> employee.getLocation().equals("Pune");
        List<Employee> puneEmployee = employeeList.stream().filter(employeePredicatePune).collect(Collectors.toList());
        System.out.println(puneEmployee);
        //list all Texas employee
        Predicate<Employee> employeePredicateTexas = employee -> employee.getLocation().equals("Texas");
        List<Employee> texasEmployee = employeeList.stream().filter(employeePredicateTexas).collect(Collectors.toList());
        System.out.println(texasEmployee);
    }
}
