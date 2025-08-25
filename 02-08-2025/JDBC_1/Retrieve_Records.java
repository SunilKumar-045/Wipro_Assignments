package JDBC_1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Retrieve_Records {
    public void displayRecords() {
        try {
            Scanner s = new Scanner(System.in);
            JDBC_Connection jdbc_connection = new JDBC_Connection();
            String query = "SELECT * FROM EMP";
            Connection con = jdbc_connection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getDouble(3));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
