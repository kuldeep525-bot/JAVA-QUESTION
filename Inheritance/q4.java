// 4. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().


class Employee{
  public void work()
  {
      System.out.println("Employee is working");
  }

  public double getSalary()
  {
    return 50000.00;
  }
}

class HRManager extends Employee{
  public void work()
  {
     System.out.println("HR Manager is manage work");
  }

  public void addEmployee(String name)
  {
    System.out.println("Adding new employee: " + name);
  }
}

class main
{
  public static void main(String st[])
  {
    Employee employee=new Employee();
    employee.work();

    System.out.println("Employee salary: " + employee.getSalary());

    HRManager hr=new HRManager();
    hr.work();

    hr.addEmployee("kuldeep");
  }
}