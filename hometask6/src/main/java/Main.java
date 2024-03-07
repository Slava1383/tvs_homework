public class Main {
    public static void main(String[] args) {
        User user1 = new User("Roman", 4, Profession.DIREKTOR);
        User user2 = new User("Timur", 5, Profession.WORKER);
        User user3 = new User("Alex", 3, Profession.HR);
        user1.info();
        user1.additionSalary();
        user1.info();
        user2.additionSalary();
        user2.info();
        user3.additionSalary();
        user3.info();
        user2.additionCharges(400);
        user3.additionCharges(680);
        user1.additionCharges(2600);
        System.out.println("Salary "+user1.getProff()+" "+ user1.getName()+ " - "+ user1.getSalary());
        System.out.println("Salary "+user1.getProff()+" "+ user1.getName()+ " - "+ user1.additionCharges(5));
        user1.info();
        user1.additionSalary();
    }
}
