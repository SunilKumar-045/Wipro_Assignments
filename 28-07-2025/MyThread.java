package pack2;

public class MyThread extends Thread{
    public void run(){

        for(int i = 1;i<5;i++){
            System.out.println(Thread.currentThread().getName());

//            try{
//                Thread.sleep(10000);
//            }catch (InterruptedException e) {
//
//                System.out.println(e);
//
//            }
        }
    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        MyThread t2 = new MyThread();

        t1.setName("Thread one");

        t2.setName("Thread-2");

        t1.start(); // Starts the first thread

        t2.start(); // Starts the  second thread

    }
}
