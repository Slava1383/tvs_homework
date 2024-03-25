import lombok.Getter;

public class Surgeon extends Doctor{
    @Override
    public void heal() {
        System.out.println("Surgeon treats");
    }
    @Override
    public String type() {
        return "surgeon";
    }
}
