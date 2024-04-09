public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Double GPA;

    Student(String first, String last, Double gradeAverage) {
        this.firstName = first;
        this.lastName = last;
        this.GPA = gradeAverage;
    }

    public int compareTo(Student otherStudent) {
        if (GPA > otherStudent.GPA) {
            return -1;
        } else if (GPA < otherStudent.GPA) {
            return 1;
        } else {
            if (lastName.compareTo(otherStudent.lastName) != 0) {
                return lastName.compareTo(otherStudent.lastName);
            } else {
                return firstName.compareTo(otherStudent.firstName);
            }
        }
    }

    public String toString() {
        return GPA + " " + lastName + ", " + firstName;
    }
}
