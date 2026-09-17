class Account {
    protected String accountNumber, holderName, accountType;
    protected double balance;
    Account(String accountNumber, String holderName,
            double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public void transfer(Account target, double amount) {
        if (withdraw(amount)) target.deposit(amount);
    }
    public void displayAccountDetails() {
}
    }
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Account Type   : " + accountType);
        System.out.printf("Balance        : Rs.%.2f%n", balance);
class SavingsAccount extends Account {
    private double interestRate;
    SavingsAccount(String no, String name, double balance, double rate) {
        super(no, name, balance, "Savings");
        interestRate = rate;
    }
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.printf("Interest        : Rs.%.2f%n", calculateInterest());
    }
}
class CurrentAccount extends Account {
    private double overdraftLimit;
    CurrentAccount(String no, String name, double balance, double limit) {
        super(no, name, balance, "Current");
        overdraftLimit = limit;
    }
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.printf("Overdraft Limit: Rs.%.2f%n", overdraftLimit);
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savings =
            new SavingsAccount("SA205", "Arjun", 12000, 6.0);
        CurrentAccount current =
            new CurrentAccount("CA305", "Meera", 18000, 6000);
        savings.deposit(3000);
        savings.withdraw(2000);
        current.withdraw(20000);
        savings.transfer(current, 2500);
        savings.displayAccountDetails();
        current.displayAccountDetails();
    }
}
