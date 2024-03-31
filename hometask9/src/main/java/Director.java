import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{
    List<Employee> empl = new ArrayList<>() {
        @Override
        public Employee get(int index) {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    };
    public Director(String firstName, String lastName, int workExp, Positions role) {
        super(firstName, lastName, workExp, role);
    }
    public void undoControl(Employee person){
        empl.add(person);
    }
    public List<Employee> getEmpl() {
        return empl;
    }

    public void setEmpl(List empl) {
        this.empl = empl;
    }

    @Override
    public String toString() {
        return "Director{" +
                "empl=" + empl +
                "} " + super.toString();
    }
}
