// 6. Select multiple rows from the database table in Java API and show the result on the screen.

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

class Connective {
    Connection con;
    Statement stm;

    Connective(String url, String user, String pwd) throws java.sql.SQLException, java.lang.ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver"); 
        con = DriverManager.getConnection(url, user, pwd);
        System.out.println("MySQL connected successfully!");
    }

    void displayMultipleRows() throws java.sql.SQLException {
        stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM students");

        System.out.println("ID | Name | Age");
        System.out.println("-------------------");

        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            System.out.println(id + " | " + name + " | " + age);
        }

        rs.close();
        stm.close();
        con.close();
    }
}

class main {
    public static void main(String[] args) throws java.sql.SQLException, java.lang.ClassNotFoundException {
        Connective obj = new Connective(
            "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC",
            "root",
            "kuldeep_525"
        );
        obj.displayMultipleRows();
    }
}
