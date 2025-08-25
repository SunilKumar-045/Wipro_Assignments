package project_employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_Information {

    public static void main(String args[]){

        ArrayList<EmployeePersonalDetails>  employeePersonalDetails = new ArrayList<>();
        employeePersonalDetails.add(new EmployeePersonalDetails("Sanjay","07/06/1999","sanjay1999@gmail.com","Hyderabad",7894561253L));

        ArrayList<EmployeeProfessionalDetails> employeeProfessionalDetails = new ArrayList<>();
        employeeProfessionalDetails.add(new EmployeeProfessionalDetails("Sanjay_Sahoo","G045","Google","sanjayggl@gmail.com","Banglore"));

        ArrayList<EmployeeSalaryDetails> employeeSalaryDetails = new ArrayList<>();
        employeeSalaryDetails.add(new EmployeeSalaryDetails(500000.0,200000.0,100000.0,100000.0,100000.0));

        ArrayList<EmployeeLeaveDetails> employeeLeaveDetails = new ArrayList<>();
        employeeLeaveDetails.add(new EmployeeLeaveDetails(30,2,6,12,18));

        ArrayList<EmployeeProjectDetails> employeeProjectDetails = new ArrayList<>();
        employeeProjectDetails.add(new EmployeeProjectDetails(5,"Website Development","Application Development","No"));

        Scanner s = new Scanner(System.in);
        System.out.println("----------Employee Menu----------");
        System.out.println("1.Display Employee Personal Details..........");
        System.out.println("2.Display Employee Professional Details......");
        System.out.println("3.Display Employee Salary Details............");
        System.out.println("4.Display Employee Leaves Details............");
        System.out.println("5.Employee Project Details...................");
        System.out.println();

        while(true){
            System.out.println("Enter the option to view the details of the Employee");
            int option = s.nextInt();
            switch (option){
                case 1:
                    System.out.println("Display Employee Personal Details");
                    System.out.println(employeePersonalDetails);
                    break;
                case 2:
                    System.out.println("Display Employee Professional Details");
                    System.out.println(employeeProfessionalDetails);
                    break;
                case 3:
                    System.out.println("Display Employee Salary Details");
                    System.out.println(employeeSalaryDetails);
                    break;
                case 4:
                    System.out.println("Display Employee Leave Details");
                    System.out.println(employeeLeaveDetails);
                    break;
                case 5:
                    System.out.println("Display Employee Project Details");
                    System.out.println(employeeProjectDetails);
                    break;
                case 6:
                    System.out.println("Exit the menu");
                    break;
                default:
                    System.out.println("Enter the valid option");
                    break;


            }

        }
    }
}
