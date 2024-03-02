package task2;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(123, 3000);
        CreditCard creditCard2 = new CreditCard(453, 3000);
        CreditCard creditCard3 = new CreditCard(847, 3000);
        creditCard1.addCurrentAmount(38);
        creditCard2.addCurrentAmount(765);
        creditCard3.withdrawFromCard(1276);
        creditCard1.info();
        creditCard2.info();
        creditCard3.info();

    }
}
