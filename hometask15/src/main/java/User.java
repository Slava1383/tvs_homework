import java.util.*;

public class User implements Comparable<User>{
    private String name;
    private int exp;
    private List<String> tasks;

    public User(String name, int exp, List<String> tasks) {
        this.name = name;
        this.exp = exp;
        this.tasks = tasks;
    }

    public boolean filterMore2(){

            if (getTasks().size() > 2) {
                return true;
            }
            return false;
        }

    @Override
    public int compareTo(User user){
        return Integer.compare(this.exp, user.getExp());
    }

    public static Map<String, Integer> sortByName(List<User> users){
        Map<String, Integer> sortedUsersByName = new HashMap<>();
        for (User user : users) {
          sortedUsersByName.put(user.getName(), sortedUsersByName.getOrDefault(user.getName(), 0) + 1);
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
