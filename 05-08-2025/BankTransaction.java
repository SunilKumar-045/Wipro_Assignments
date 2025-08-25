package pack2;

public class BankTransaction {
    public static void main(String args[]){

        SynchronizedProcess synchronizedProcess = new SynchronizedProcess();
        Thread t1 = new Thread(
                ()->{
                    for(int i=1;i<=5;i++){
                        synchronizedProcess.amt_Deposit(1000);
                        try{
                            Thread.sleep(5000);
                        }catch(InterruptedException ie){
                            ie.printStackTrace();
                        }
                    }
                }
        );
        Thread t2 = new Thread(
                ()->{
                    for(int i=1;i<=5;i++){
                        synchronizedProcess.amt_withdraw(2000);
                        try{
                            Thread.sleep(5000);
                        }catch(InterruptedException ie){
                            ie.printStackTrace();
                        }
                    }
                }
        );

        t1.start();
        try{
            t1.join();

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        t2.start();

        try{

            t2.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }



        System.out.println("Total Balance: "+synchronizedProcess.getAcct_balance());


    }
}
