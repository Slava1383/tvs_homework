public class Therapist extends Doctor{
    private Doctor[] doctors = new Doctor[2];
    public Therapist(Doctor...doctors){
        this.doctors = doctors;
    }
    @Override
    public void heal() {
        System.out.println("Therapist treats");
    }

    @Override
    public String type() {
        return "therapist";
    }

    public void setDoctor(Patient patient){
        int trPlan = patient.getTrPlan();
        if(trPlan == 1){
            for (var doctor:doctors){
                if(doctor.type().equals("surgeon")){
                    patient.setDoctor(doctor);
                }
            }
        } else if (trPlan == 2) {
            for (var doctor:doctors){
                if(doctor.type().equals("dentist")){
                    patient.setDoctor(doctor);
                }
            }
        }else {
            patient.setDoctor(this);
        }
    }
}
