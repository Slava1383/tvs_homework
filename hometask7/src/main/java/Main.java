import animalsVoice.Dog;
import animalsVoice.Cat;
import computerName.Computer;
import computerName.HP;
import computerName.Mac;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.doVoice();
        cat.doVoice();
        Computer hp = new HP();
        Mac mac = new Mac();
        hp.getClassName();
        mac.getClassName();
    }
}
