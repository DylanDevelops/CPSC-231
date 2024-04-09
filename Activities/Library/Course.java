public class Course implements Comparable<Course> {
    private String department;
    private Integer number;

    Course(String dept, Integer num) {
        this.department = dept;
        this.number = num;
    }

    public int compareTo(Course otherCourse) {
        if(department.compareTo(otherCourse.department) != 0) {
            return department.compareTo(otherCourse.department);
        } else {
            return number.compareTo(otherCourse.number);
        }
    }

    public String toString() {
        return department + " " + number;
    }
}
