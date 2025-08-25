package main;
import java.sql.Date;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        CustomerShopping cs = new CustomerShopping();

        while (true) {
            System.out.println("\n===== CUSTOMER PRODUCT MENU =====");
            System.out.println("1. Insert Customer");
            System.out.println("2. Insert Product");
            System.out.println("3. Buy Product");
            System.out.println("4. Display Customer with Products & Total Price");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Details:");
                    System.out.print("ID: ");
                    int custId = sc.nextInt(); sc.nextLine();
                    System.out.print("Name: ");
                    String custName = sc.nextLine();
                    System.out.print("Contact: ");
                    String custContact = sc.nextLine();
                    System.out.print("Gender (M/F): ");
                    String custGender = sc.nextLine();
                    System.out.print("Address: ");
                    String custAddr = sc.nextLine();
                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("Zipcode: ");
                    String zipcode = sc.nextLine();

                    Customer c = new Customer(custId, custName, custContact, custGender, custAddr, city, zipcode);
                    cs.insertCustData(c);
                    System.out.println("Customer inserted successfully.....");
                    break;

                case 2:
                    System.out.println("Enter Product Details:");
                    System.out.print("Product ID: ");
                    int prodId = sc.nextInt(); sc.nextLine();
                    System.out.print("Code: ");
                    String prodCode = sc.nextLine();
                    System.out.print("Description: ");
                    String prodDesc = sc.nextLine();
                    System.out.print("Price: ");
                    double prodPrice = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int prodQty = sc.nextInt(); sc.nextLine();
                    System.out.print("Expiry Date");
                    String expDate = sc.nextLine();
                    System.out.print("Customer ID (who buys this): ");
                    int cid = sc.nextInt();

                    Product p = new Product(prodId, prodCode, prodDesc, prodPrice, prodQty, Date.valueOf(expDate));
                    cs.insertProductData(p, cid);
                    System.out.println("Product inserted successfully....");
                    break;

                case 3:
                    System.out.print("Enter Product ID to Buy: ");
                    int buyProdId = sc.nextInt();
                    System.out.print("Enter Quantity to Buy: ");
                    int buyQty = sc.nextInt();
                    cs.buyProducts(buyProdId, buyQty);
                    System.out.println("Product purchased successfully.....");
                    break;

                case 4:
                    System.out.println("\n--- Customer with Products & Total Price ---");
                    cs.display();
                    break;

                case 5:
                    System.out.println("Exiting....Exited");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
