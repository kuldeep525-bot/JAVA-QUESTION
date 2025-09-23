// 9. Write a Java program to manage the driver with path, username and password, if not successful then throw an exception

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class manageDriver{
  public static void main(String st[])
  {
    try
    {
      class.forName("com.sql.jdbc.Driver");
      Connection con=DriverManager.getConnection("url","root","pwd");
      System.out.println("database connected succesfully");
    }

    catch (Exception e) {
          System.out.println(e);
        }
        finally{
          System.out.println("thankyou");
        }
  }
}