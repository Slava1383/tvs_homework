public class Worker extends Employee{

    public Worker(String firstName, String lastName, int workExp, Positions role) {
        super(firstName, lastName, workExp, role);
    }

    @Override
    public String toString() {
        return "Worker{} " + super.toString();
    }
}
