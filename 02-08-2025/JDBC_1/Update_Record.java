package JDBC_1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Update_Record {
    public void updateRecord() {
        try {
            Scanner s = new Scanner(System.in);
            JDBC_Connection jdbc_connection = new JDBC_Connection();
            System.out.println("Enter the empId: ");
            int empId = Integer.parseInt(s.nextLine());
            String query = "SELECT * FROM EMP WHERE EMPID="+empId;

            Connection con = jdbc_connection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getDouble(3));

                break;
            }
            System.out.println();
            System.out.println("Enter the details to update");
            System.out.println("Enter the empName: ");
            String empName = s.nextLine();
            System.out.println("Enter the empSalary: ");
            double empSalary = s.nextDouble();
            String insertQuery = "UPDATE EMP SET EMPNAME='"+empName+"',EMPSALARY="+empSalary+" where empId ="+ empId;
            int count = st.executeUpdate(insertQuery);
            System.out.println("Updated the Record Successfully....");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();

        }


    }
    }

