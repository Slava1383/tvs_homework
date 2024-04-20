import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private String name;
    private int exp;
    private List<String> tasks;

    public User(String name, int exp, List<String> tasks) {
        this.name = name;
        this.exp = exp;
        this.tasks = tasks;
    }

    public static List<User> filterMore2(List<User> users){
        List<User> filteredUsers = new ArrayList<>();
        for (User user : users) {
            if (user.getTasks().size() > 2) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }

    public static int sortUsersByExp(User user1, User user2){
        return Integer.compare(user2.getExp(), user1.getExp());
    }

    public static Set<String> sortByName(List<User> users){
        Set<String> sortedUsersByName = new HashSet<>();
        for (User user : users) {
            sortedUsersByName.add(user.getName());
        }
        return sortedUsersByName;
    }

    public String getName() {
        return name;
    }

    public int getExp() {
        return exp;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", exp=" + exp +
                ", tasks=" + tasks +
                '}';
    }
}
