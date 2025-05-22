class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        
    }

    
}

class Bank {
    private BankAccount[] accounts;
    private int count;

    public Bank() {
        
    }

    public void addAccount(BankAccount account) {
       
    }

    public void withdraw(int accountNumber, double amount) {
        
    }

    public void displayAccounts() {
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        
        bank.addAccount(new BankAccount(1001, "Alice", 5000.0));
        bank.addAccount(new BankAccount(1002, "Bob", 3000.0));

       
        bank.withdraw(1001, 6000.0);

        
        bank.withdraw(1002, 1000.0);

      
        bank.displayAccounts();
    }
}