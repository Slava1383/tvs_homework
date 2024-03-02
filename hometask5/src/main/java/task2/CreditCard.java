package task2;

public class CreditCard {
    public int account;
    public int currentAmount;

    public CreditCard(int account, int currentAmount){
        this.account = account;
        this.currentAmount = currentAmount;
    }
    public void addCurrentAmount(int currentAmount){
        this.currentAmount += currentAmount;
    }
    public void withdrawFromCard(int currentAmount){
        if(currentAmount < this.currentAmount){
            this.currentAmount -= currentAmount;
        }
    }
    public void info(){
        System.out.println("Account number - "+account+", amount on account - "+currentAmount+".");
    }
}
