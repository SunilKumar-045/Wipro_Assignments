package pack2;

public class Factorial {

    public void findfactorial(int number){
        int factorialValue = 1;
        for(int i=number;i>=1;i--){
            factorialValue *= i;
        }
        System.out.println("Fatorial of a given number is: "+factorialValue);
    }

    public static void main(String args[]){
        Factorial factorial = new Factorial();
        factorial.findfactorial(5);
    }
}
