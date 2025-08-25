package pack2;
import java.util.Scanner;
public class NestedException {
    public static void main(String args[]){
        int arr[] = {100,0};
        try{
            System.out.println("Outer try block.....");
            try{
                int result = arr[0]/arr[1];
                System.out.println("result: "+result);
            }
            catch(ArithmeticException ae){
                System.out.println("Cannot be divided by zero....");
            }
             System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("Excepiton is ArrayIndexOutOfBound");
        }
    }

}
