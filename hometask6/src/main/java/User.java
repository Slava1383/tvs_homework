public class User {
    private String name;
    private int experiance;
    private Profession proff;
    private int salary;

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

    public Profession getProff() {
        return proff;
    }

    public int getSalary() {
        return salary;
    }

    public void info(){
        System.out.println("Salary "+proff+" "+ name+ " - "+ salary);
    }
    public int additionSalary(){
        salary = 1000 * experiance * proff.getCoeff();
        return salary;
    }
    public int additionCharges(int addCh){
        return salary + addCh;
    }
}
