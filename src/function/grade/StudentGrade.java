/**
 * Create by saurabh
 * Date: 11/11/23
 * Project Name: Java-8
 */
package function.grade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentGrade {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ram",50));
        studentList.add(new Student("Shyam",70));
        studentList.add(new Student("Rishi",65));
        studentList.add(new Student("Vikas",38));
        Function<Student,String> studentGrade = student -> {
            if(student.getNumber()>40 && student.getNumber()<50){
                return "Third Division";
            } else if (student.getNumber()>50 && student.getNumber()<60) {
                return "Second Division";

            } else if (student.getNumber()>60) {
                return "First Division";
            }else{
                return "Fail";
            }
        };
        System.out.println("Student garde is :" +studentGrade.apply(new Student("Vikas",38)));
    }
}
