package task1;

public class Cat {
    public String name;
    public int age;
    public String breed;
    public Cat(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public Cat(String name, int age){
        this(name, age, "no breed");
    }
    public void info(){
        System.out.println("Name cat: "+name+", age cat: "+age+", breed cat: "+breed);
    }
    public void newName(String name){
        this.name = name;
        info();
    }
}
