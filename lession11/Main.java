package lession11;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 11: OOP - Bank Account Example");

        BankAccount account1 = new BankAccount("A001", "Rathana", 500.0);
        BankAccount account2 = new BankAccount("A002", "Sokha", 1000.0);

        System.out.println(account1.getAccountInfo());
        System.out.println(account2.getAccountInfo());

        account1.deposit(250.0);
        account1.withdraw(100.0);
        account1.showBalance();

        account2.deposit(300.0);
        account2.withdraw(1500.0);
        account2.showBalance();
    }
}

class BankAccount {
    private String accountId;
    private String ownerName;
    private double balance;

    public BankAccount(String accountId, String ownerName, double balance) {
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: $" + amount + " successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance. Cannot withdraw $" + amount);
            return;
        }

        balance -= amount;
        System.out.println("Withdraw: $" + amount + " successfully.");
    }

    public void showBalance() {
        System.out.println(ownerName + " balance: $" + balance);
    }

    public String getAccountInfo() {
        return "Account ID: " + accountId + ", Owner: " + ownerName + ", Balance: $" + balance;
    }
}
