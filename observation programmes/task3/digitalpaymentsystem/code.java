import java.util.Scanner;
interface PaymentService {
    void pay(String upiId, double amount) throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException;
    void checkBalance();
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    public InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class Wallet {
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    public Wallet(String userName, String mobileNumber, String upiId) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = 0;
    }

    public void addMoney(double amount) throws InvalidAmountException {
        if (amount <= 0)
            throw new InvalidAmountException("Amount must be greater than zero.");
        balance += amount;
        System.out.println("₹" + amount + " added successfully.");
    }

    public void deductMoney(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void displayWalletDetails() {
        System.out.println("\n----- Wallet Details -----");
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.println("Balance       : ₹" + balance);
    }
}

class UPIPayment implements PaymentService {
    private Wallet wallet;

    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(String upiId, double amount) throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException {
        if (upiId == null || !upiId.contains("@") || upiId.startsWith("@") || upiId.endsWith("@") || upiId.indexOf("@") != upiId.lastIndexOf("@"))
            throw new InvalidUPIException("Invalid UPI ID.");

        if (amount <= 0)
            throw new InvalidAmountException("Payment amount must be greater than zero.");

        if (amount > wallet.getBalance())
            throw new InsufficientBalanceException("Insufficient balance. Available balance: ₹" + wallet.getBalance());

        wallet.deductMoney(amount);
        System.out.println("\n========== PAYMENT SUCCESS ==========");
        System.out.println("Amount Paid : ₹" + amount);
        System.out.println("Paid To     : " + upiId);
        System.out.println("Remaining   : ₹" + wallet.getBalance());
        System.out.println("=====================================");
    }

    @Override
    public void checkBalance() {
        System.out.println("Available Balance: ₹" + wallet.getBalance());
    }
}

public class DigitalPaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wallet wallet = null;
        PaymentService payment = null;
        int choice;

        do {
            System.out.println("\n===== DIGITAL PAYMENT SYSTEM =====");
            System.out.println("1. Create Wallet");
            System.out.println("2. Add Money");
            System.out.println("3. Make UPI Payment");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Wallet Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        if (wallet != null) {
                            System.out.println("Wallet already exists!");
                            break;
                        }

                        System.out.print("Enter your name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter mobile number: ");
                        String mobile = sc.nextLine();

                        System.out.print("Enter your UPI ID: ");
                        String upi = sc.nextLine();

                        wallet = new Wallet(name, mobile, upi);
                        payment = new UPIPayment(wallet);
                        System.out.println("Wallet created successfully!");
                        break;

                    case 2:
                        if (wallet == null) {
                            System.out.println("Please create a wallet first.");
                            break;
                        }

                        System.out.print("Enter amount to add: ₹");
                        double addAmount = sc.nextDouble();
                        wallet.addMoney(addAmount);
                        System.out.println("Current Balance: ₹" + wallet.getBalance());
                        break;

                    case 3:
                        if (wallet == null) {
                            System.out.println("Please create a wallet first.");
                            break;
                        }

                        System.out.print("Enter receiver UPI ID: ");
                        String receiverUPI = sc.nextLine();

                        System.out.print("Enter payment amount: ₹");
                        double paymentAmount = sc.nextDouble();
                        payment.pay(receiverUPI, paymentAmount);
                        break;

                    case 4:
                        if (wallet == null) {
                            System.out.println("Please create a wallet first.");
                            break;
                        }
                        payment.checkBalance();
                        break;

                    case 5:
                        if (wallet == null) {
                            System.out.println("Please create a wallet first.");
                            break;
                        }
                        wallet.displayWalletDetails();
                        break;

                    case 6:
                        System.out.println("Thank you for using Digital Payment System!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InvalidUPIException e) {
                System.out.println("Transaction Failed: " + e.getMessage());
            } catch (InvalidAmountException e) {
                System.out.println("Transaction Failed: " + e.getMessage());
            } catch (InsufficientBalanceException e) {
                System.out.println("Transaction Failed: " + e.getMessage());
            } finally {
                System.out.println("Transaction processing completed.");
            }
        } while (choice != 6);

        if (wallet != null) {
            System.out.println("\nFINAL WALLET DETAILS");
            wallet.displayWalletDetails();
        }

        sc.close();
    }
}

