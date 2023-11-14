/**
 * Create by saurabh
 * Date: 14/11/23
 * Project Name: Java-8
 */
package stream.ems;

import function.total.EmployeeTotalSalary;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeProcessing {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(
                new Employee("Raghu","Bangalore",101,26,"Male","Engineering",1000000));
        employeeList.add(
                new Employee("Jason","Hyderabad",102,30,"Male","Engineering",2500000));
        employeeList.add(
                new Employee("Samantha","Chennai",103,28,"Female","HR",1000000));
        employeeList.add(
                new Employee("Ravi","Noida",104,32,"Male","Legal",1000000));
        employeeList.add(
                new Employee("Bhanu","Noida",105,28,"Male","Legal",1000000));
        employeeList.add(
                new Employee("Anjali","Delhi",106,26,"Female","Finance",1000000));
        employeeList.add(
                new Employee("Suman","Delhi",107,26,"Female","Finance",1000000));
        employeeList.add(
                new Employee("Pooja","Noida",108,28,"Female","Engineering",2000000));
        employeeList.add(
                new Employee("Ramesh","Bangalore",109,30,"Male","Engineering",1500000));
        employeeList.add(
                new Employee("Ravindra","Pune",110,26,"Male","Devops",1000000));
        employeeList.add(
                new Employee("Arun","Pune",111,26,"Male","Devops",1000000));

        //count number of male employee
        long maleCount = employeeList.stream().filter(employee -> employee.getEmployeeGender().equals("Male")).count();
        System.out.println(maleCount);
        //count number of female employee
        long femaleCount = employeeList.stream().filter(employee -> employee.employeeGender.equals("Female")).count();
        System.out.println(femaleCount);
        //Count all employee from Bangalore location
        long bangaloreAllEmployeeCount = employeeList.stream().filter(employee -> employee.employeeLocation.equals("Bangalore")).count();
        System.out.println(bangaloreAllEmployeeCount);
        //count all employee
        long allEemployeeCount = employeeList.stream().count();
        System.out.println(allEemployeeCount);
        //All department
        List<String> allDepartment = employeeList.stream().map(Employee::getEmployeeDepartment).distinct().collect(Collectors.toList());
        System.out.println(allDepartment);
        //Average age of male employee
        Map<String, Double> averageEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmployeeGender, Collectors.averagingInt(Employee::getEmployeeAge)));
        System.out.println(averageEmployee);
        //Average salary of male employee
        DoubleSummaryStatistics maleAverageSalary = employeeList.stream().filter(employee -> employee.getEmployeeGender().equals("Male")).collect(Collectors.summarizingDouble(Employee::getEmployeeSalary));
        System.out.println(maleAverageSalary);

    }
}
