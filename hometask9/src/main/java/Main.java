public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Vasya", "Petrov", 3, Positions.WORKER);
        Worker worker2 = new Worker("Ivan", "Nortman", 2, Positions.WORKER);
        Worker worker3 = new Worker("Roman", "Smirnov", 6, Positions.WORKER);
        Director director1 = new Director("Dmitriy", "Fedotov", 8, Positions.DIRECTOR);

        worker1.info();
        worker2.info();
        worker3.info();
        director1.info();
        director1.undoControl(worker1);
        director1.undoControl(worker3);
        System.out.println(director1);
    }
}
