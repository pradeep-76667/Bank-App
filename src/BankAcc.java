public interface BankAcc {
//    withdraw money
//    check balance
//    add money
//    get rOI
//    get totalInterest

    Boolean withdrawMoney(int money) ;
    Boolean addMoney(int money)
    int checkBalance();
    int getROI();
    int getTotalInterest(int amount, int timeInYears);
}