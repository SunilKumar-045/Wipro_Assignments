package pack2;

public class SynchronizedProcess {

    private int acct_balance = 10000;

    public synchronized void amt_Deposit(int amount){
        acct_balance += amount;
        System.out.println(amount+" Amount depostied");
        System.out.println("Balance: "+acct_balance);
    }

    public synchronized void amt_withdraw(int amount){
        if(amount>acct_balance){
            System.out.println("Insufficent Balance.......");
        }
        else{
            acct_balance-=amount;
            System.out.println(amount+" withdrawn....");
            System.out.println("Total balance: "+acct_balance);

        }
    }

    public int getAcct_balance(){
        return acct_balance;
    }
}
