package callablestatement;
import java.sql.*;
public class JDBC_Applicaton1 {

    public static void main(String args[])throws Exception{

        String url = "jdbc:mysql://localhost:3306/java_selenium";
        String username = "root";
        String password = "root";


    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, username, password);
    CallableStatement cs = con.prepareCall("{call insertActor(?,?,?,?)}");

    cs.setInt(1, 001);
    cs.setString(2, "Arjun");
    cs.setString(3, "male");
    cs.setInt(4, 30);
//        cs.execute();

    cs.setInt(1, 002);
    cs.setString(2, "Kajol");
    cs.setString(3, "female");
    cs.setInt(4, 35);
//        cs.execute();

    cs.setInt(1, 003);
    cs.setString(2, "Roshan");
    cs.setString(3, "male");
    cs.setInt(4, 40);
//        cs.execute();


    cs.setInt(1, 004);
    cs.setString(2, "Venkatesh");
    cs.setString(3, "male");
    cs.setInt(4, 60);
//        cs.execute();
    cs.executeUpdate();

    System.out.println("Rows inserted");


    }
}
