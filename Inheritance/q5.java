// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.


class BankAccount {
    double balance = 10000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit amount=" + amount + ", New balance=" + balance);
    }

    public int withdraw(int amount) {
        if (amount >balance   ) {
            System.out.println("Insufficient balance");
            return -1;
        }
        balance -= amount;
        System.out.println("Withdraw amount=" + amount + ", New balance=" + balance);
        return 1;
    }
}

class SavingsAccount extends BankAccount {
    // Override

    public int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return -1;
        }
        // Check if the balance will fall below 100 before updating
        if (balance - amount < 100) {
            System.out.println("Withdrawal not allowed: balance would fall below one hundred.");
            return -1;
        }
        balance -= amount;
        System.out.println("Withdraw amount=" + amount + ", New balance=" + balance);
        return 1;
    }
}

class main {
    public static void main(String st[]) {
        BankAccount obj1 = new BankAccount();
        obj1.deposit(5000);

        SavingsAccount obj2 = new SavingsAccount();
        obj2.withdraw(9500);
    }
}


