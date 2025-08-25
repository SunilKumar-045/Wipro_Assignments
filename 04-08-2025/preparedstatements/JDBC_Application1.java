package preparedstatements;

import java.sql.*;
public class JDBC_Application1 {

    public static void main(String args[]){

        String url = "jdbc:mysql://localhost:3306/java_selenium";
        String username = "root";
        String password = "root";
        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        String selectSQL = "SELECT * FROM USERS WHERE email= ?";
        String deleteSQL = "DELETE FROM USERS WHERE email=?";
        String updateSQL = "UPDATE USERS SET name = 'raju',email='raju@gmail.com' WHERE id = ?";
        try {

            Class.forName("com.mysql.cj.jdbc.Drivers");
            Connection con = DriverManager.getConnection(url, username, password);
//            PreparedStatement ps = con.prepareStatement(insertSQL);
//            ps.setString(1, "Sunny");
//            ps.setString(2,"sunny@gmail.com");
//            int count = ps.executeUpdate();
//            System.out.println("1 row inserted");

//            PreparedStatement ps1 = con.prepareStatement(selectSQL);
//            ps1.setString(1,"sunil@gmail.com");
//            ResultSet rs = ps1.executeQuery();
//            while(rs.next()){
//                System.out.println("User: " + rs.getString("name"));
//            }

//            PreparedStatement ps2 = con.prepareStatement(deleteSQL);
//            ps2.setString(1,"raju@gmail.com");
//            int count2 = ps2.executeUpdate();
//            System.out.println("selected row deleted");

            PreparedStatement ps3 = con.prepareStatement(updateSQL);
            ps3.setInt(1, 2);
            int count2 = ps3.executeUpdate();
            System.out.println("Updated row deleted");


        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally bock executed");
        }
    }
}
