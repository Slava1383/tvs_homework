public class User {
    private String name;
    private int experiance;
    private Profession proff;
    private int count;

    public User(String name, int experiance, Profession proff) {
        this.name = name;
        this.experiance = experiance;
        this.proff = proff;
    }

    public String getName() {
        return name;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
    public void info(){
        if(proff == Profession.DIREKTOR){
            System.out.println("Salary "+Profession.DIREKTOR+" "+ name+ " - "+ count);
        } else if (proff == Profession.WORKER) {
            System.out.println("Salary "+Profession.WORKER+" "+ name+ " - "+ count);
        } else if (proff == Profession.HR) {
            System.out.println("Salary "+Profession.HR+" "+ name+ " - "+ count);
        }
    }
    public void additionSalary(){
        if(proff == Profession.DIREKTOR){
            count = 1000 * experiance * 6;
        } else if (proff == Profession.WORKER) {
            count = 1000 * experiance * 3;
        } else if (proff == Profession.HR) {
            count = 1000 * experiance * 4;
        }
        info();
    }
    public void additionCharges(int addCh){
        count += addCh;
        info();
    }
}
