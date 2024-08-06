public class Main {
    public static void main(String[] args) {
        FunctionClass functionClass = new FunctionClass();
        System.out.println(functionClass.bynToUsdFunction.apply("28 BYN"));
        functionClass.bynToUsdConsumer.accept("28 BYN");
        System.out.println(functionClass.bynToUsdSupplier.get());
    }
}
