package JDBC_1;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_Record {
    public void insertRecord() {
        try {
            Scanner s = new Scanner(System.in);
            JDBC_Connection jdbc_connection = new JDBC_Connection();
            System.out.println("Enter the empId: ");
            int empId = Integer.parseInt(s.nextLine());
            System.out.println("Enter the empName: ");
            String empName = s.nextLine();
            System.out.println("Enter the empSalary: ");
            double empSalary = s.nextDouble();
            String query = "INSERT INTO EMP VALUES(empId,empName,empSalary)";
            Connection con = jdbc_connection.getConnection();
            Statement st = con.createStatement();
            int count = st.executeUpdate(query);
            if(count<=1){
                System.out.println("Insertion of the Record is Successful....");
            }else{
                System.out.println("No record inserted...");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
