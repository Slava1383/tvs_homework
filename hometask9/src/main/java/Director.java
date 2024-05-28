import java.util.*;

public class Director extends Employee {
    ArrayList<Employee> employees = new ArrayList<>();

    public Director(String firstName, String lastName, int workExp) {
        super(firstName, lastName, workExp, Positions.DIRECTOR);
    }

    public void undoControl(Employee employee) {
        employees.add(employee);
    }

//    public boolean servisSearch(Director dir, String name) {
//        for(var sr : dir.employees){
//            System.out.println(sr);
//            if(sr.getFirstName().equals(name)){
//                System.out.println(sr.getFirstName());
//                return true;
//            } else if ((sr.getRole().equals(Positions.DIRECTOR))) {
//                servisSearch((Director)sr,name);
//                return true;
//            }
//        }
//        return false;
//    }
        @Override
        public String toString () {
            return "Director { " + super.toString() + "\n" + employees;
        }
    }
