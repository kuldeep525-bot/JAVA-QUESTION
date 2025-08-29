// 17. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.


abstract class BankAccount{
   double balance;

  public BankAccount()
  {
    this.balance=1000;
  }

  abstract void deposit(double amount);
  abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount{

  void deposit(double amount)
  {
    balance+=amount;
    System.out.println("deposit: " + amount + ", New Balance: " + balance);
  }

  void withdraw(double amount)
  {
    if(amount<=balance)
    {
    balance-=amount;
    System.out.println("withdraw: " + amount + ", New Balance: " + balance);
    }

    else{
      System.out.println("Not sufficent balance");
    }
  }

}


class main{
  public static void main(String st[])
  {
    SavingsAccount saving=new SavingsAccount();
    saving.deposit(100.00);
    saving.withdraw(100);
  }
}