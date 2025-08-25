import java.util.Scanner;

public class ExceptionHanding {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num, den, result;
        try {
            System.out.print("Enter the Numberator:");
            num = s.nextInt();
            System.out.print("Enter the Denominator:");
            den = s.nextInt();

            result = num / den;
            System.out.println("Result: " + result);
        }
        finally {
            System.out.println("first try block without catch bliock");
        }
//          catch (ArithmeticException ae) {
//            System.out.println("num cannot be divided by zero") ;
//            ae.printStackTrace();
//        }
//            catch (Exception e) {
//            e.printStackTrace();
//        }

        //ArrayIndexOutOfBound Excepiton
        try {
            int[] arr = new int[5];
            System.out.println("values are:");
            arr[5] = s.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("ArrayOutOfBoundsException");
            ai.printStackTrace();
        }

    }
}
