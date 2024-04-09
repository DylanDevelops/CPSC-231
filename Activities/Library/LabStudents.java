import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabStudents {
   public static void main(String[] args) {
      int j;
      Scanner scnr = new Scanner(System.in);

      ArrayList<Course> courses = new ArrayList<Course>();
      ArrayList<Student> students = new ArrayList<Student>();

      // Input 5 courses
      for (j = 0; j < 5; ++j) {
         courses.add(new Course(scnr.next(), scnr.nextInt()));
      }
      // Input 5 students
      for (j = 0; j < 5; ++j) {
         students.add(new Student(scnr.next(), scnr.next(), scnr.nextDouble()));
      }

      // Sort courses and students
      Collections.sort(courses);
      Collections.sort(students);

      // Output courses and students
      for (j = 0; j < courses.size(); ++j) {
         System.out.println(courses.get(j));
      }
      System.out.println();
      for (j = 0; j < students.size(); ++j) {
         System.out.println(students.get(j));
      }
   }
}
