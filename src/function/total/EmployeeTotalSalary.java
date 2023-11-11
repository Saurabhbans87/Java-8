/**
 * Create by saurabh
 * Date: 11/11/23
 * Project Name: Java-8
 */
package function.total;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmployeeTotalSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rahul",800000,"HR"));
        employeeList.add(new Employee("Rohit",600000,"Admin"));
        employeeList.add(new Employee("Gopal",1000000,"Engineering"));
        employeeList.add(new Employee("Priya",700000,"Payroll"));
        Function<List<Employee>,Double> employeeTptalSalary = employees -> {
            double totalSalary = 0;
            for (Employee employee:employees) {
                totalSalary = totalSalary+ employee.getSalary();
            }
            return totalSalary;
        };
        System.out.println("Total salry is :" +employeeTptalSalary.apply(employeeList));
    }
}
