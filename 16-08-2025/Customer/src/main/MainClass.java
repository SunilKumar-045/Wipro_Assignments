package main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Implementation imp = new Implementation();
        System.out.println("1.Insert the Customer Data...");
        System.out.println("2.Insert the Product Data....");
        System.out.println("3.Buy Products withRespect to the Customer");
        System.out.println("4.Display the Customer details with resect to product and totalPrice");
        imp.gotCon();
        while (true) {
            System.out.println("Enter your choice");
            int choice = s.nextInt();
            switch (choice) {
                case 1:{
                    imp.insertCustData();
                    break;
                }
                case 2:{
                    imp.insertProductData();
                    break;
                }
                case 3:{
                    imp.buyProducts();
                    break;
                }
                case 4:{
                    imp.display();
                    break;
                }
                default:{
                    System.out.println("Enter the valid option");
                }
            }
        }
    }
}
