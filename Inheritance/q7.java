// 7. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title

class Person{
  public void getFirstName(String firstname)
  {
     System.out.println("FirstName:"+firstname);
  }

  public void getLastName(String lastname)
  {
     System.out.println("FirstName:"+lastname);
  }
}

class Employee{
  public void getEmployeeId(String Employeeid)
  {
    System.out.println("Employeeid:"+Employeeid); 
  }

   public void getLastName(String lastname,String jobtitle)
  {
     System.out.println("FirstName:"+lastname);
     System.out.println("job title:"+jobtitle);
  } 
}


class main{
  public static void main(String st[])
  {
    Person obj1=new Person();
    obj1.getFirstName("kuldeep");

    Employee obj2=new Employee();
    obj2.getLastName("kumar","software developer");
    obj2.getEmployeeId("4121/24");
  }
}