public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Therapist therapist = new Therapist();
        patient1.setTrPlan(0);
        patient2.setTrPlan(2);
        therapist.setDoctor(patient1);
    }
}
