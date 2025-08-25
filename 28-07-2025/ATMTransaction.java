package pack2;

public class ATMTransaction {
    public static void main(String args[]){

        SynchronizedAtm synchronizedAtm = new SynchronizedAtm();
        Thread t1 = new Thread(
                ()-> {
                    for (int i = 1; i < 3; i++) {
                        synchronizedAtm.withdraw_Amt(200, "Sunil");

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ie) {
                            ie.printStackTrace();
                        }
                    }
                }
        );

        Thread t2 = new Thread(
                ()->{

                    for (int i = 1; i < 3; i++) {
                    synchronizedAtm.withdraw_Amt(200,"Shiva");
                    try{
                        Thread.sleep(5000);
                    }catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                }
                }
        );

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("Balance Present:"+synchronizedAtm.getBalance());
    }
}
