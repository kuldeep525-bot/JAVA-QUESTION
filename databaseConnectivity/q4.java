// 4. Update the row in the table in the database from Java API.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class connectivity{
  Connection con;
  Statement stm;
  connectivity(String url,String user,String pwd) throws java.sql.SQLException, java.lang.ClassNotFoundException
  {
      Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection(url,user,pwd);
      System.out.println("MY SQL CONNECTED SUCCESSFUL");
  }

  void update() throws java.sql.SQLException, java.lang.ClassNotFoundException
  {
    stm=con.createStatement();
    String query="update students set age=18 where id=40";
    int res=stm.executeUpdate(query);
    System.out.println(res+"record updated");
    con.close();
  }
}

class main{
  public static void main(String st[]) throws java.sql.SQLException, java.lang.ClassNotFoundException,java.io.IOException
  {
     connectivity connect=new connectivity("jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC","root","kuldeep_525");

     connect.update();
  }
}