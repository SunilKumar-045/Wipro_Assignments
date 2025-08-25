package pack2;

public class ExCatchBlock {
    public static void main(String args[]){
        int x = 50;
        int y = 0;
        try{
            int result = x/y;
            System.out.println(result);
        }
        catch(ArithmeticException ae){
            System.out.println("Arthimetic Excepiton found");

            try{
                String str=null;
                int str_length = str.length();
                System.out.println(str_length);
            }catch (NullPointerException ne){
                System.out.println("String is null....");
            }
        }
    }
}
