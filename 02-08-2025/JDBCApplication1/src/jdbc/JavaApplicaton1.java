package jdbc;

import java.sql.*;

public class JavaApplicaton1 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/java_selenium";
		String username = "root";
		String password = "root";
		
		String query = "INSERT INTO emp(empId,empName,empSalary) values(1009,'harry',1000000)";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(url,username,password);
			Statement st = c.createStatement();
			int count = st.executeUpdate(query);
			System.out.println("Number of rows affected by this query "+count);
			st.close();
			c.close();
			System.out.println("Connetion closed...");
		}catch(ClassNotFoundException | SQLException e) {
			System.err.println("JDBC driver not found: "+e.getMessage());
		}

	}

}
