import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class FunctionClass {
    Function<String, Double> bynToUsdFunction = (input) -> {
        double sum = Double.parseDouble(input.split(" ")[0]);
        return sum * 0.31;
    };
    Consumer<String> bynToUsdConsumer = (input) -> {
        double sum = Double.parseDouble(input.split(" ")[0]);
        System.out.println(sum * 0.31);
    };
    Supplier<String> bynToUsdSupplier = () -> {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = new StringBuilder(str).reverse().toString();
        return str;
    };
}
