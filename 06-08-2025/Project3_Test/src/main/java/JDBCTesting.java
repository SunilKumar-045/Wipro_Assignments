package main.java;

import java.sql.*;

public class JDBCTesting {
	

     String insertSQL = "INSERT INTO emp(empId,empName,empSalary) values(1001,'Sunil',500000)";
     String deleteSQL = "DELETE FROM emp WHERE empId=1011";
     String updateSQL = "UPDATE emp SET empName='Yogi',empSalary=500000 WHERE empId=1002";
     String url = "jdbc:mysql://localhost:3306/java_selenium";
     String username = "root";
     String password = "root";

     
     public Connection con = null;
     public Connection getConnection(){
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection(url,username,password);
         }catch(Exception e){e.printStackTrace();}
         return con;
     }
     
	//Insert Query
	public int insertQuery() {
		int count = 0;
		try {
			con = DriverManager.getConnection(url,username,password);
			Statement s1 = con.createStatement();
			count = s1.executeUpdate(insertSQL);
			System.out.println("Inserted row "+count);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return count;
	}
	
	
	//Update Query
	public int updateQuery() {
		int count1 = 0;
		try {
			con = DriverManager.getConnection(url,username,password);
			Statement s2 = con.createStatement();
			count1 = s2.executeUpdate(updateSQL);
			System.out.println("Updated row "+count1);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return count1;
	}
	
	//DeleteQuery
	public int deleteQuery() {
		int count2 = 0;
	        try {
				con = DriverManager.getConnection(url,username,password);
	        	Statement s3 = con.createStatement();
	        	count2 = s3.executeUpdate(deleteSQL);
	        	System.out.println("Delete row "+count2);
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	        return count2;

	}

}
