// 1. Create the connection with MySQL Database and manage the driver.

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

class connectMYSQL{
  public static void main(String st[])
  {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC",
                "root",
                "kuldeep_525");
                  System.out.println("Mysql connected succesfully:");
    }


    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
  }
}