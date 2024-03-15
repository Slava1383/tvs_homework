public class Patient {
    private int trPlan;
    private String doctor;

    public int getTrPlan() {
        return trPlan;
    }

    public void setTrPlan(int trPlan) {
        this.trPlan = trPlan;
        new Therapist().appointDoctor(trPlan);
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
