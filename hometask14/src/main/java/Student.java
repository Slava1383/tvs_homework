import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String sex;
    private List<String> courses;

    public Student(String name, int age, String sex, List<String> courses){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.courses = courses;
    }

    public static List<Student> filterBySex(List<Student> students){
        List<Student> resultStudents = new ArrayList<>();
        for(Student student : students){
            if(student.getSex().equals("male")){
                resultStudents.add(student);
            }
        }
        return resultStudents;
    }
    public static List<Student> filterByAge(List<Student> students){
        List<Student> resultStudents = new ArrayList<>();
        for(Student student : students){
            if(student.getAge() < 20){
                resultStudents.add(student);
            }
        }
        return resultStudents;
    }
    public static List<Student> filterLess2Courses(List<Student> students){
        List<Student> resultStudents = new ArrayList<>();
        for(Student student : students){
            if(student.getCourses().size() < 2){
                resultStudents.add(student);
            }
        }
        return resultStudents;
    }
    public static List<Student> filterCoursProgramm(List<Student> students){
        List<Student> resultStudents = new ArrayList<>();
        for(Student student : students){
            if(student.getCourses().contains("Programming")){
                resultStudents.add(student);
            }
        }
        return resultStudents;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public List<String> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", courses=" + courses +
                '}' + '\n';
    }
}
