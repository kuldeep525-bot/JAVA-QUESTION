// 3. Create a Java program to access the java.util.Date class through import keyword and print the current date of the system but inherit the Date class.

import java.util.Date;

class CurrentDate{
  protected Date currentDate;

  CurrentDate()
  {
    this.currentDate=new Date();
  }

  void printCurrentDate() {
        System.out.println("Current Date: " + currentDate);
    }
}


 class main {
    public static void main(String st[]) {
        CurrentDate date = new CurrentDate();
        date.printCurrentDate();
    }
}


