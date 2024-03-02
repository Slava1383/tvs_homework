public class Main {
    public static void main(String[] args) {
        User user1 = new User("Roman", 4, Profession.DIREKTOR);
        User user2 = new User("Timur", 5, Profession.WORKER);
        User user3 = new User("Alex", 3, Profession.HR);
        user1.additionSalary();
        user2.additionSalary();
        user3.additionSalary();
        user2.additionCharges(400);
        user3.additionCharges(680);
        user1.additionCharges(2600);
        user1.additionSalary();
    }
}
