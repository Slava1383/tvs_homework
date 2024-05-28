import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", 3, List.of("task1")));
        users.add(new User("Roman", 4, List.of("task34", "task25")));
        users.add(new User("Ivan", 1, List.of("task1", "task2", "task4", "task34")));
        List<User> filteredUsersTasks = new ArrayList<>();
        for (User user : users) {
            if(user.filterMore2()){
                filteredUsersTasks.add(user);
            }
        }
        filteredUsersTasks.forEach(System.out::println);
        //users.stream().sorted(User :: sortUsersByExp).forEach(System.out::println);
        Collections.sort(users);
        Collections.reverse(users);
        users.forEach(System.out::println);

        Map<String, Integer> filterUsersByName = User.sortByName(users);
        for (User name: users){
            if(filterUsersByName.get(name.getName()) ==1 ){
                System.out.println(name);

            }
        }
    }
}
