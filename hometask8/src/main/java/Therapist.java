public class Therapist extends Patient{
    public void treat() {
        System.out.println("Therapist treats");
    }
    public void appointDoctor(int plan){
        switch (plan){
        case 1: setDoctor("Surgeon");
        new Surgeon().treat();
        break;
        case 2: setDoctor("Dentist");
        new Dentist().treat();
        break;
        default: treat();
        }
    }
}
