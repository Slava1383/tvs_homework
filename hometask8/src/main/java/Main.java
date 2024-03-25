public class Main {
    public static void main(String[] args) {
      Doctor surgeon = new Surgeon();
      Doctor dentist = new Dentist();
      Therapist therapist = new Therapist(surgeon, dentist);
      Patient patient = new Patient(4);
      therapist.setDoctor(patient);
      Doctor doctor = patient.getDoctor();
      doctor.heal();
    }
}
