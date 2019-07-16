package collection;

import java.util.Comparator;

public class Student {
 public String Name;
 public int roll;
 private String course;
 public Student(String Name,int roll,String course) {
        // TODO Auto-generated constructor stub
         this.Name=Name;
         this.roll=roll;
         this.course=course;
 }
 public void printStudent()
 {
         System.out.println(Name+" "+roll+" "+course);
 }
}
 