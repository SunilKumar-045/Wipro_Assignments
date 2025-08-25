package JDBC_1;

import java.util.Scanner;

public class MainClass {
    public static void main(String args[]){

        try{
            Scanner s = new Scanner(System.in);
            Insert_Record insert = new Insert_Record();
            Retrieve_Records retrieve = new Retrieve_Records();
            Update_Record update = new Update_Record();
            Delete_Record delete = new Delete_Record();


            while(true){
                System.out.println("Employee Menu");
                System.out.println("1.Insert a Record.....");
                System.out.println("2.Delete a Record.....");
                System.out.println("3.Update a Record.....");
                System.out.println("4.Display all the records");
                System.out.println("5.Exit");
                System.out.println();
                System.out.println("Enter the option from 1 to 5");
                int option = s.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Insertion of a Record....");
                        insert.insertRecord();
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Deletion of a Record....");
                        delete.deleteRecord();
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Updation of a Record.....");
                        update.updateRecord();
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Displaying all the Records....");
                        retrieve.displayRecords();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Exiting..... Exited");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option.....\nEnter the valid option");
                }

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
