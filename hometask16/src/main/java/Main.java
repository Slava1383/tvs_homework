public class Main {
    public static void main(String[] args) {
        WordMultiple wordMultiple = new WordMultiple();
        String[] str = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple.wordMultipleToMap(str));
        System.out.println("-------------------");
        String[] str2 = {"man", "moon", "good", "night"};
        System.out.println(wordMultiple.pairs(str2));
    }
}
