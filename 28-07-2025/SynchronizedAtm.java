package pack2;

public class SynchronizedAtm {

    private int balance = 1000;
    public synchronized void withdraw_Amt(int amount,String name){
        if(amount>balance){
            System.out.println("Insufficient Balance...");
            System.out.println("Balance:"+amount);
        }else {
            balance -= amount;
            System.out.println(name + " withdrawed amount of:" + amount);
            System.out.println("Balance:"+balance);
        }
    }

    public int getBalance(){
        return balance;
    }
}
