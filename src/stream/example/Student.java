/**
 * Create by saurabh
 * Date: 21/04/24
 * Project Name: Java-8
 */
package stream.example;

import java.util.Date;

public class Student {
    String name;
    int id;
    String subject;
    double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
