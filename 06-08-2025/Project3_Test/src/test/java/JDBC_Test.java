package test.java;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.sql.Connection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.java.JDBCTesting;

public class JDBC_Test {

	JDBCTesting jdbc = new JDBCTesting();
	Connection con = jdbc.getConnection();
	
	@BeforeAll
	public void testconnection() {
		assertTrue(con!=null);
	}
	
	
	@Test
	public void testinsert() {
		int result = jdbc.insertQuery();
		assertEquals(1, result);
	}
	
	@Test
	public void testdelete() {
		int result = jdbc.deleteQuery();
		assertEquals(1, result);
	}
	
	@Test
	public void testupdate() {
		int result = jdbc.updateQuery();
		assertEquals(1, result);
	}
	
	@AfterAll
	public void closeconnection() {
		assertTrue(con!=null);
		try {con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
}
