package pack2;

import java.util.Scanner;

public class Validation {

    public void validationCheck(int grade)throws GradeValidationException {
        if(grade<0 || grade>100){
            throw new GradeValidationException("InvalidGradeException....");
        }
        else{
            System.out.println("ValidGrade....");
        }
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Student Name:");
        String stud_name = s.nextLine();
        System.out.print("Enter the Student Grade:");
        int grade = s.nextInt();
        Validation validation = new Validation();
        try{

            validation.validationCheck(grade);
        }
        catch (GradeValidationException gv){
            System.out.println(gv.getMessage());
        }
        finally{
            System.out.println("finally block gets executed");
            s.close();
        }

    }
}

