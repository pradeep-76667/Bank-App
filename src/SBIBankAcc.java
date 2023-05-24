import java.util.UUID;

public class SBIBankAcc implements BankAcc {
    private final String accountNumber;
    private int balance;
    private final int ROI;
    int minimumBalance = 500;

    public SBIBankAcc(int balance) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.ROI = 5;
    }

    public SBIBankAcc(int balance, int ROI) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.ROI = ROI;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public Boolean withdrawMoney(int money) {
        if(this.balance >= money && this.balance >= minimumBalance){
            this.balance = this.balance - money;
            return true;
        }
        return false;
    }

    @Override
    public Boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int getROI() {
        return this.ROI;
    }

    @Override
    public int getTotalInterest(int amount, int timeInYears) {
        return amount * timeInYears * ROI / 100;
    }
}