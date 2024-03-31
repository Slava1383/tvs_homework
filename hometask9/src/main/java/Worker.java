public class Worker extends Employee{

    public Worker(String firstName, String lastName, int workExp) {
        super(firstName, lastName, workExp, Positions.WORKER);
    }

    @Override
    public String toString() {
        return "Worker { " + super.toString() + " }"+"\n";
    }
}
