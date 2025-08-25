package test;

import main.Customer;
import main.CustomerShopping;
import main.GetConnection;
import main.Product;
import org.junit.jupiter.api.*;
import java.sql.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomerShoppingTest {
    static CustomerShopping shopping;
    static Connection con;

    @BeforeAll
    static void setup() throws Exception {
        shopping = new CustomerShopping();
        con = new GetConnection().getCon();
        Assertions.assertNotNull(con, "DB Connection should not be null");
    }

    @Test
    @Order(1)
    void testInsertCustomer() throws Exception {
        Customer c = new Customer(101, "Sunil", "9876543210",
                "M", "Hyderabad", "Hyderabad", "500001");
        int rows = shopping.insertCustData(c);
        Assertions.assertEquals(1, rows, "Customer should be inserted");
    }

    @Test
    @Order(2)
    void testInsertProduct() throws Exception {
        Product p = new Product(201, "P001", "Laptop", 55000.0, 10,
                Date.valueOf("2026-12-31"));
        shopping.insertProductData(p, 101);

        // verify
        PreparedStatement ps = con.prepareStatement("SELECT * FROM Product WHERE product_id=?");
        ps.setInt(1, 201);
        ResultSet rs = ps.executeQuery();
        Assertions.assertTrue(rs.next(), "Product should exist after insert");
        Assertions.assertEquals("Laptop", rs.getString("product_desc"));
    }

    @Test
    @Order(3)
    void testBuyProducts() throws Exception {
        shopping.buyProducts(201, 2);
        PreparedStatement ps = con.prepareStatement("SELECT product_qty FROM Product WHERE product_id=?");
        ps.setInt(1, 201);
        ResultSet rs = ps.executeQuery();
        rs.next();
        int qty = rs.getInt(1);
        Assertions.assertEquals(8, qty, "Product qty should reduce by 2");
    }

    @Test
    @Order(4)
    void testDisplay() throws Exception {
        System.out.println("\n===== Display Data =====");
        shopping.display();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM Product WHERE cust_id=101");
        rs.next();
        int count = rs.getInt(1);
        Assertions.assertTrue(count > 0, "Customer should have products");
    }

    @AfterAll
    static void cleanup() throws Exception {
        Statement st = con.createStatement();
        st.executeUpdate("DELETE FROM Product WHERE product_id=201");
        st.executeUpdate("DELETE FROM Customer WHERE cust_id=101");
        con.close();
    }
}
