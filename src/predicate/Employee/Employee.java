/**
 * Create by saurabh
 * Date: 11/11/23
 * Project Name: Java-8
 */
package predicate.Employee;

public class Employee {
    String name;
    int age;
    String companyName;
    String degignation;
    String skill;
    String location;

    public Employee(String name, int age, String companyName, String degignation, String skill, String location) {
        this.name = name;
        this.age = age;
        this.companyName = companyName;
        this.degignation = degignation;
        this.skill = skill;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDegignation() {
        return degignation;
    }

    public void setDegignation(String degignation) {
        this.degignation = degignation;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", companyName='" + companyName + '\'' +
                ", degignation='" + degignation + '\'' +
                ", skill='" + skill + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
