// 4. Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.

import java.util.ArrayList;
import java.util.List;

// Interface for Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    double getBalance();
}

// SavingsAccount class implementing Account interface
class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

  //override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

  //override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

  //override
    public void calculateInterest() {
        balance += balance * 0.05; // 5% interest
        System.out.println("Interest added. New balance: " + balance);
    }

  //override
    public double getBalance() {
        return balance;
    }
}

// CurrentAccount class implementing Account interface
class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

  //override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

  //override
    public void withdraw(double amount) {
        balance -= amount; // No overdraft limit for simplicity
        System.out.println("Withdrawn: " + amount);
    }

  //override
    public void calculateInterest() {
        // No interest for current accounts
        System.out.println("No interest for current accounts");
    }

  //override
    public double getBalance() {
        return balance;
    }
}

// Bank class to manage accounts
class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully");
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Balance: " + account.getBalance());
        }
    }
}

// Main class to run the banking system
 class BankingSystem {
    public static void main(String st[]) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CurrentAccount currentAccount = new CurrentAccount(500);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.calculateInterest();

        currentAccount.deposit(300);
        currentAccount.withdraw(100);

        bank.displayAccounts();
    }
}