package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerShopping {

    private Connection con;
    Scanner s = new Scanner(System.in);
        GetConnection getcon = new GetConnection();

        public int insertCustData(Customer c) {
            con = getcon.getCon();
            int count=0;
            String query = "INSERT INTO CUSTOMER values(?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, c.getCustId());
                ps.setString(2, c.getCustName());
                ps.setString(3, c.getCustContact());
                ps.setString(4, c.getCustGender());
                ps.setString(5, c.getCustAddr());
                ps.setString(6, c.getCity());
                ps.setString(7, c.getZipcode());
                count = ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return count;
        }


        public void insertProductData(Product p, int custId){
            try {
                con = getcon.getCon();
                String query = "INSERT INTO Product VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, p.getProductId());
                ps.setString(2, p.getProductCode());
                ps.setString(3, p.getProductDesc());
                ps.setDouble(4, p.getProductPrice());
                ps.setInt(5, p.getProductQty());
                ps.setDate(6, p.getProductExpDate());
                ps.setInt(7, custId);  // link with Customer
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public void buyProducts(int productId, int buyQty) throws Exception {
            try {
                con = getcon.getCon();
                String sql = "UPDATE Product SET product_qty = product_qty - ? WHERE product_id = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, buyQty);
                ps.setInt(2, productId);
                ps.executeUpdate();
            }catch (Exception e){
                e.printStackTrace();
            }

        }


        public void display(){
            try {
                con = getcon.getCon();
                String sql = "SELECT c.cust_id, c.cust_name, p.product_code, p.product_price, p.product_qty, " +
                        "(p.product_price * p.product_qty) AS total_price " +
                        "FROM Customer c JOIN Product p ON c.cust_id = p.cust_id";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    System.out.println("Customer ID: " + rs.getInt("cust_id") +
                            ", Name: " + rs.getString("cust_name") +
                            ", Product: " + rs.getString("product_code") +
                            ", Qty: " + rs.getInt("product_qty") +
                            ", Price: " + rs.getDouble("product_price") +
                            ", Total: " + rs.getDouble("total_price"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


}
