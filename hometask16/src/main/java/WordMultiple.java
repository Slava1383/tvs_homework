import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultipleToMap(String[] words) {
        Map<String, Boolean> map = new HashMap<>();
        Map<String,Integer> counter = new HashMap<>();
        for (String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }
        for (var word : counter.entrySet()) {
            map.put(word.getKey(), word.getValue() >= 2);
        }
        return map;
    }
    public Map<String,String> pairs(String[] str){
        Map<String,String> map = new HashMap<>();
        for (String word : str) {
            String first = word.substring(0, 1);
            String last = word.substring(word.length()-1);
            map.put(first, last);
        }
        return map;
    }
}
