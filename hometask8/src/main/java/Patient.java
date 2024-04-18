public class Patient {
    private int trPlan;
    private Doctor doctor;

    public Patient(int trPlan) {
        this.trPlan = trPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public int getTrPlan() {
        return trPlan;
    }

    public void setTrPlan(int trPlan) {
        this.trPlan = trPlan;

    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
