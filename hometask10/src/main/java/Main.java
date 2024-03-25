public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person1 = new Person("Roma", 28, 15000, new Cat());
        System.out.println(person1.hashCode());
        System.out.println(person1.toString());
        Person person2 = (Person)person1.clone();
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person1.equals(person2));
    }
}
