/**
 * Create by saurabh
 * Date: 14/11/23
 * Project Name: Java-8
 */
package stream.ems;

public class Employee {
    String employeeName;
    String employeeLocation;
    int employeeId;
    int employeeAge;
    String employeeGender;
    String employeeDepartment;
    double employeeSalary;

    public Employee(String employeeName, String employeeLocation, int employeeId, int employeeAge, String employeeGender, String employeeDepartment, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeLocation = employeeLocation;
        this.employeeId = employeeId;
        this.employeeAge = employeeAge;
        this.employeeGender = employeeGender;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeLocation() {
        return employeeLocation;
    }

    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeLocation='" + employeeLocation + '\'' +
                ", employeeId=" + employeeId +
                ", employeeAge=" + employeeAge +
                ", employeeGender='" + employeeGender + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
