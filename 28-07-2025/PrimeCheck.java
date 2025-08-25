package pack2;

public class PrimeCheck{

    public boolean isPrime(int number){
        if(number<=1){
            System.out.println("Provide a valid number");
        }

        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public static void main(String args[]){
        PrimeCheck prime = new PrimeCheck();
        boolean status = prime.isPrime(4);
        if(status==true){
            System.out.println("Given number is prime number....");
        }else{
            System.out.println("Given number is not a prime number....");
        }
    }
}
