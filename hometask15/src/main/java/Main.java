import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", 3, List.of("task1")));
        users.add(new User("Roman", 4, List.of("task34", "task25")));
        users.add(new User("Ivan", 1, List.of("task1", "task2", "task4", "task34")));
        List<User> filteredUsersTasks = User.filterMore2(users);
        filteredUsersTasks.forEach(System.out::println);
        users.stream().sorted(User :: sortUsersByExp).forEach(System.out::println);
        Set<String> filterUsersByName = User.sortByName(users);
        filterUsersByName.forEach(System.out::println);
    }
}
