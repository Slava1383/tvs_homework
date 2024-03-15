public class Therapist {
    Patient patient = new Patient();
    public void treat() {
        System.out.println("Therapist treats");
    }
    public void appointDoctor(int plan){
        switch (plan){
        case 1: patient.setDoctor("Surgeon");
        new Surgeon().treat();
        break;
        case 2: patient.setDoctor("Dentist");
        new Dentist().treat();
        break;
        default: treat();
        }
    }
}
