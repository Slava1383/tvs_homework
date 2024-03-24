import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Hello World. I am learning Java.";
        System.out.println(text.length());
        String[] splitTxt = text.split("o");
        System.out.println(Arrays.toString(splitTxt));
        System.out.println(splitTxt.length);
        String index = text.substring(13);
        System.out.println(index);
        StringBuilder sb = new StringBuilder(text);
        System.out.println(sb.reverse().toString());
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher("slaVa@reg.com");
        System.out.println(matcher.matches());

    }
}
