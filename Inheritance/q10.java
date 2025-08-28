// 10. Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.


abstract class Employee{
  abstract void details();

  abstract void calculateBonus();

  abstract void generatePerformanceReport();

  abstract void manageProjects();

}

class Manager extends Employee {
  protected String name;
  protected String address;
  protected double salary;
  protected String jobTitle;

    Manager(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // @Override
    void details() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Salary: " + this.salary);
        System.out.println("Job Title: " + this.jobTitle);
    }

    void  calculateBonus() {
        System.out.println("bounus of manager :" +salary * 0.15) ; // Example bonus calculation
    }

    void generatePerformanceReport() {
        System.out.println("Manager Performance Report: " + name);
    }

     void manageProjects() {
         System.out.println(name + " is managing projects.");
     }
}

class Developer extends Manager{

    Developer(String name,String address,double salary, String jobTitle)
    {
        super(name,address,salary,jobTitle);
    }

    void details()
    {
        System.out.println("Developer details");
         System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Salary: " + this.salary);
        System.out.println("Job Title: " + this.jobTitle);
    }
    void calculateBonus() {
        System.out.println("Bonus of developer: " + salary * 0.10); // Example bonus calculation
    }

 
    void generatePerformanceReport() {
        System.out.println("Developer Performance Report: " + name);
    }

 
    void manageProjects() {
        System.out.println(name + " is working on projects.");
    }
}

class Programmer extends Manager{
     Programmer(String name,String address,double salary, String jobTitle)
    {
        super(name,address,salary,jobTitle);
    }

    void details()
    {
        System.out.println("Developer details");
         System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Salary: " + this.salary);
        System.out.println("Job Title: " + this.jobTitle);
    }
    void calculateBonus() {
        System.out.println("Bonus of developer: " + salary * 0.9); // Example bonus calculation
    }

 
    void generatePerformanceReport() {
        System.out.println("Developer Performance Report: " + name);
    }

 
    void manageProjects() {
        System.out.println(name + " is working on projects.");
    }
}

 class main {
    public static void main(String st[]) {
        Manager manager = new Manager("Kuldeep Kumar", "# 876 ", 90000, "Full Stack Developer Manager");
        manager.details();
        manager.calculateBonus();
        manager.generatePerformanceReport();
        manager.manageProjects();

        System.out.println("\n");

        Developer dev = new Developer("nitin", "123 Main St", 75000, "Software Developer");
        dev.details();
        dev.calculateBonus();
        dev.generatePerformanceReport();
        dev.manageProjects();

        System.out.println("\n");

        Programmer pro = new Programmer("Milan", "sector 7 chandigarh", 6000, "java programmer");
        pro.details();
        pro.calculateBonus();
        pro.generatePerformanceReport();
        pro.manageProjects();
    
    }
}





