public class Dentist extends Doctor{
    @Override
    public void heal() {
        System.out.println("Dentist treats");
    }
    @Override
    public String type() {
        return "dentist";
    }
}
