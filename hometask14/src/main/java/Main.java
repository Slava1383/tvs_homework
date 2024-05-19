import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Petr", 23, "male", List.of("Programming","Mathematics"));
        Student student1 = new Student("Roman", 30, "male", List.of("History","Penie","Sport"));
        Student student2 = new Student("Daria", 25, "female", List.of("Programming"));
        Student student3 = new Student("Irina", 18, "female", List.of("Mathematics"));
        List<Student> students = List.of(student, student1, student2, student3);
        List<Student> men = Student.filterBySex(students);
        System.out.println(men);
        List<Student> ageMore20 = Student.filterByAge(students);
        System.out.println(ageMore20);
        List<Student> less2Courses = Student.filterLess2Courses(students);
        System.out.println(less2Courses);
        List<Student> courseProgramm = Student.filterCoursProgramm(students);
        System.out.println(courseProgramm);
    }
}
