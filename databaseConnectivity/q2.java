// 2. Create the table in the database from Java API


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

class createTable{
  public static void main(String st[])
  {
   try
   {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC",
                "root",
                "kuldeep_525");
                  System.out.println("Mysql connected succesfully:");

                  Statement stm=con.createStatement();

                     String sql = "CREATE TABLE college (" +
                         "rollno INT PRIMARY KEY," +
                         "name VARCHAR(50) NOT NULL," +
                         "age INT NOT NULL" +
                         ")";

            stm.executeUpdate(sql);
            System.out.println("Table 'students' created successfully!");
            con.close();
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
  }
}
