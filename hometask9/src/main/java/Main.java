public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Vasya", "Petrov", 3);
        Worker worker2 = new Worker("Ivan", "Nortman", 2);
        Worker worker3 = new Worker("Roman", "Smirnov", 6);
        Director director1 = new Director("Dmitriy", "Fedotov", 8);
        Director director2 = new Director("new_Direktor","newDirLastName",1);
        ServiceSearch serviceSearch = new ServiceSearch();

        worker1.info();
        worker2.info();
        worker3.info();
        director1.info();
        System.out.println("------------");
        director1.undoControl(worker1);
        director1.undoControl(worker3);
        System.out.println(director1);
        System.out.println("-------------");
        director2.undoControl(worker2);
        director1.undoControl(director2);
        System.out.println(director1);
        System.out.println("-------------");
        boolean search = serviceSearch.servisSearch(director1,"Ivan");
        System.out.println(search);
    }
}
