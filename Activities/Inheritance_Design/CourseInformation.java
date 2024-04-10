import java.util.Scanner;

public class CourseInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Course myCourse = new Course();
      OfferedCourse myOfferedCourse = new OfferedCourse();

      String courseNumber, courseTitle;
      String oCourseNumber, oCourseTitle, instructorName, location, classTime;

      courseNumber = scnr.nextLine();
      courseTitle = scnr.nextLine();

      oCourseNumber =  scnr.nextLine();
      oCourseTitle =  scnr.nextLine();
      instructorName = scnr.nextLine();
      location = scnr.nextLine();
      classTime = scnr.nextLine();

      myCourse.setCourseNumber(courseNumber);
      myCourse.setCourseTitle(courseTitle);
      myCourse.printInfo();

      myOfferedCourse.setCourseNumber(oCourseNumber);
      myOfferedCourse.setCourseTitle(oCourseTitle);
      myOfferedCourse.setInstructorName(instructorName);
      myOfferedCourse.setLocation(location);
      myOfferedCourse.setClassTime(classTime);
      myOfferedCourse.printInfo();

      System.out.println("   Instructor Name: " + myOfferedCourse.getInstructorName());
      System.out.println("   Location: " + myOfferedCourse.getLocation());
      System.out.println("   Class Time: " + myOfferedCourse.getClassTime());
   }
}
