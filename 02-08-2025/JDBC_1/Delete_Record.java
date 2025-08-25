package JDBC_1;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Delete_Record {

    public void deleteRecord() {
        try {
            Scanner s = new Scanner(System.in);
            JDBC_Connection jdbc_connection = new JDBC_Connection();
            System.out.println("Enter the empId to delete the record: ");
            int empId = Integer.parseInt(s.nextLine());
            String query = "DELETE FROM EMP WHERE EMPID = " + empId;
            Connection con = jdbc_connection.getConnection();
            Statement st = con.createStatement();
            int count = st.executeUpdate(query);
            if(count<=1){
                System.out.println("Deletion of the record is successful.....");
            }else{
                System.out.println("No record deleted...");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
