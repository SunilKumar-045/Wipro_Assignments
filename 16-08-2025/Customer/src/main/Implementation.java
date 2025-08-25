package main;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Implementation {
    private Connection con;
    Scanner s = new Scanner(System.in);
    public void gotCon(){

        GetConnection getcon = new GetConnection();
        con = getcon.getCon();
    }
    public void insertCustData(){
        String query = "INSERT INTO CUSTOMER values(?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(query);
            System.out.print("Enter the customer id:");
            int cust_id = Integer.parseInt(s.nextLine());
            System.out.print("Enter the customer name:");
            String cust_name = s.nextLine();
            System.out.print("Enter the customer contact:");
            long cust_contact = Long.parseLong(s.nextLine());
            System.out.print("Enter the gender:");
            String gender = s.nextLine();
            System.out.print("Enter the address:");
            String address = s.nextLine();
            System.out.print("Enter the city:");
            String city = s.nextLine();
            System.out.print("Enter the zipcode:");
            int zipcode = Integer.parseInt(s.nextLine());
            ps.setInt(1,cust_id);
            ps.setString(2,cust_name);
            ps.setLong(3,cust_contact);
            ps.setString(4,gender);
            ps.setString(5,address);
            ps.setString(6,city);
            ps.setInt(7,zipcode);
            int count = ps.executeUpdate();
            if(count>=1){
                System.out.println("Customer data Inserted Successfully......");
            }else{
                System.out.println("Data not inserted..........");
            }
            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void insertProductData(){
        String query = "INSERT INTO PRODUCT values(?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(query);
            System.out.print("Enter the customer id:");
            int cust_id = Integer.parseInt(s.nextLine());
            System.out.print("Enter the product id:");
            int product_id = Integer.parseInt(s.nextLine());
            System.out.print("Enter the product code:");
            String product_code = s.nextLine();
            System.out.print("Enter the product description:");
            String product_description = s.nextLine();
            System.out.print("Enter the product price:");
            double product_price = Double.parseDouble(s.nextLine());
            System.out.print("Enter the product quantity:");
            int product_qty = Integer.parseInt(s.nextLine());
            System.out.print("Enter the product_expdate:");
            String product_expdata = s.nextLine();
            ps.setInt(1,cust_id);
            ps.setInt(2,product_id);
            ps.setString(3,product_code);
            ps.setString(4,product_description);
            ps.setDouble(5,product_price);
            ps.setInt(6,product_qty);
            ps.setString(7,product_expdata);
            int count = ps.executeUpdate();
            if(count>=1){
                System.out.println("Product data Inserted Successfully......");
            }else{
                System.out.println("Data not inserted..........");
            }
            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    ArrayList<Integer> products = new ArrayList<>();
    public int customer_id;
    public List<Integer> buyProducts(){
        System.out.println("Provide your customer Id:");
        customer_id = Integer.parseInt(s.nextLine());
       String option="y";
        while(option.equalsIgnoreCase("y")){
            System.out.println("Enter the products id you want to buy:");
            int prodId = Integer.parseInt(s.nextLine());
            products.add(prodId);
            System.out.println("You want to buy something say y/n:");
            option = s.nextLine();
        }
        System.out.println("Customer purchased the products.....");
        System.out.println();
        return products;
    }

    public void display(){
        System.out.println("Enter the customer id:");
        int id = Integer.parseInt(s.nextLine());
        String query = "SELECT * FROM CUSTOMER WHERE cust_id=?";
        try {
            PreparedStatement ps1 = con.prepareStatement(query);
            ps1.setInt(1,id);
            ResultSet rs = ps1.executeQuery();
            while(rs.next()){
                System.out.println("Customer ID: " + rs.getInt("cust_id") +
                        ", Name: " + rs.getString("cust_name") +" Purchased the following items");

                String query1 = "SELECT * FROM PRODUCT WHERE product_id=?";
                PreparedStatement ps2 = con.prepareStatement(query1);
                for(int ids : products){
                    ps1.setInt(1,ids);
                    ResultSet rs1 = ps2.executeQuery();
                    double totalPrice = 0;
                    while(rs.next()){
                        System.out.println("productId:"+rs1.getInt(1)+","+"product description: "+rs1.getString(4)+","+"product price:"+rs1.getDouble(5));
                        totalPrice+=rs1.getDouble(5);
                    }
                    System.out.println("Total Price: "+totalPrice);
                    System.out.println();
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
