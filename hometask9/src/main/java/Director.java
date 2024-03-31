import java.util.*;
import java.util.function.IntFunction;

public class Director extends Employee {
    ArrayList<Employee> employees = new ArrayList<>();

    public Director(String firstName, String lastName, int workExp) {
        super(firstName, lastName, workExp, Positions.DIRECTOR);
    }

    public void undoControl(Employee employee) {
        employees.add(employee);
    }

    public boolean servisSearch(String name) {
        for (int i = 0 ; i < employees.size() ; i++){
            if(employees.equals(name)) {
                return true;
            }
        }
        return false;
    }
        @Override
        public String toString () {
            return "Director { " + super.toString() + "\n" + employees;
        }
    }
