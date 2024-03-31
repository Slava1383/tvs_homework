import java.util.Objects;

public class Person implements Cloneable{
    private String name;
    private int age;
    private int salary;
    private Cat cat;

    public Person(String name, int age, int salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return new Person("Dima",age,salary,cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", cat=" + cat +
                '}';
    }
}
