
import org.apache.commons.collections4.ListUtils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "e", "f");
        List<String> list3 = ListUtils.union(list, list2);
        System.out.println(list3);
    }
}