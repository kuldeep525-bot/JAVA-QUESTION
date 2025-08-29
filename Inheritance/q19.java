// 19. Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.

abstract class Employee{
      protected String name;
    protected int baseSalary;

    // Constructor
    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

  abstract double calculateSalary();
  abstract void displayInfo();
}

class Manager extends Employee{
   private double bonus;

    // Constructor
    public Manager(String name, int baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return (baseSalary * bonus/100)+baseSalary;
    }

    void displayInfo() {
        System.out.println("Manager: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
} 

class Programmer extends Employee{
   private double bonus;

    // Constructor
    public Programmer(String name, int baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return (baseSalary * bonus/100)+baseSalary;
    }

    void displayInfo() {
        System.out.println("Manager: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
} 

class main{
  public static void main(String st[])
  {
    Employee manager=new Manager("kuldeep kumar",60000,8.0);
    Employee programmer=new Programmer("milan bharti",70000,8.0);

    System.out.println("Manager detalis");
    manager.displayInfo();

    System.out.println("Programmer detalis");
    programmer.displayInfo();

  }
}