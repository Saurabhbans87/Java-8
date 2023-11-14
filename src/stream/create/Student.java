/**
 * Create by saurabh
 * Date: 14/11/23
 * Project Name: Java-8
 */
package stream.create;

import java.util.List;

public class Student {
    String name;
    List<String> subject;
    String city;

    public Student(String name, List<String> subject, String city) {
        this.name = name;
        this.subject = subject;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                ", city='" + city + '\'' +
                '}';
    }
}
