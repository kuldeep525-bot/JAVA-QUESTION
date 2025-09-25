// 10. Write a Java program to throw the SQL Query, insert, delete, update, if not successful then throw an exception



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.io.*;

class Database {
    Connection con;
    Statement stm;

    public Database(String url, String uname, String pwd) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        // Establish connection
        con = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Database connected successfully");
        // Create statement
        stm = con.createStatement();
    }

    int insert_db(String query) throws SQLException {
        return stm.executeUpdate(query);
    }

    int delete_db(String query) throws SQLException {
        return stm.executeUpdate(query);
    }

    int update_db(String query) throws SQLException {
        return stm.executeUpdate(query);
    }
}

class jdbc1 {
    int id;
    String name;
    int age;

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the id: ");
        id = Integer.parseInt(br.readLine());
        System.out.print("Enter the name: ");
        name = br.readLine();
        System.out.print("Enter the age: ");
        age = Integer.parseInt(br.readLine());
    }

    void deletedata() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the id to delete: ");
        id = Integer.parseInt(br.readLine());
    }

    void updatedata() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the id of the student to update: ");
        id = Integer.parseInt(br.readLine());
        System.out.print("Enter the new name: ");
        name = br.readLine();
        System.out.print("Enter the new age: ");
        age = Integer.parseInt(br.readLine());
    }

    public static void main(String[] st) {
        try {
            Database db = new Database(
                "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC",
                "root",
                "kuldeep_525"
            );

            jdbc1 jd1 = new jdbc1();

            //  INSERT DATA
            //  jd1.input();
            // String query = "INSERT INTO students VALUES ("+jd1.id+", '"+jd1.name+"', "+jd1.age+")";
            // int res = db.insert_db(query);
            // System.out.println(res + " record inserted");

            // // //DELETE DATA
            // // jd1.deletedata();
            // // String query="delete from students where id="+jd1.id;
            // // int res = db.delete_db(query);
            // // System.out.println(res + " record deleted");

            // ---- UPDATE Example ----
            jd1.updatedata();
            String query = "UPDATE students SET name='" + jd1.name + "', age=" + jd1.age + " WHERE id=" + jd1.id;
            int res = db.update_db(query);
            System.out.println(res + " record updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
