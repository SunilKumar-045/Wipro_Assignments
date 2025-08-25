package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
    public Connection con;
    public Connection getCon(){
        String url = "jdbc:mysql://localhost:3306/java_selenium";
        String username = "root";
        String password = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}

