public abstract class Employee {
    private String firstName;
    private String lastName;
    private int workExp;
    private Positions role;
    public Employee(String firstName, String lastName, int workExp, Positions role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workExp = workExp;
        this.role = role;
    }
    public void info(){
        System.out.format("Name - %s %s, expireans - %s, position - %s\n",firstName,lastName,workExp,role);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public Positions getRole() {
        return role;
    }

    public void setRole(Positions role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", workExp=" + workExp +
                ", role=" + role +
                '}';
    }
}
