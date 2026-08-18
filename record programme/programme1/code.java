class Account {
    protected int accountNumber;
    protected double balance;
    protected String accountType;

    Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Transfer successful: " + amount);
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, "Savings Account");
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: " + interest);
    }
}
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance, "Current Account");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        SavingsAccount s1 =
                new SavingsAccount(101, 10000, 5);

        CurrentAccount c1 =
                new CurrentAccount(102, 5000, 3000);

        System.out.println(" SAVINGS ACCOUNT ");

        s1.displayDetails();

        s1.deposit(2000);

        s1.withdraw(3000);

        s1.calculateInterest();

        System.out.println("Balance after transactions: " + s1.balance);


        System.out.println("\nCURRENT ACCOUNT ");

        c1.displayDetails();

        c1.deposit(2000);

        c1.withdraw(9000);

        System.out.println("Balance after transactions: " + c1.balance);


        System.out.println("\n TRANSFER ");

        s1.transfer(c1, 2000);

        System.out.println("\nSavings Account Balance: " + s1.balance);
        System.out.println("Current Account Balance: " + c1.balance);
    }
}
