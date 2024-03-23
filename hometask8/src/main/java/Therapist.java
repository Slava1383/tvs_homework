public class Therapist {
    public void treat() {
        System.out.println("Therapist treats");
    }
    public void setDoctor(Patient patient){

        switch (patient.getTrPlan()){
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
