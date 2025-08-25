package pack2;

public class Counteer {



        private int count = 0;

        // synchronized method to avoid race condition

        public synchronized void increment() {

            //System.out.print("Count: "+count);

            count++;

        }

        public int getCount() {

            return count;

        }

    }

    class SyncThread extends Thread {

        Counteer counteer;

        SyncThread(Counteer counteer) {

            this.counteer = counteer;

        }

        public void run() {

            System.out.println("Run method");

            for (int i = 0; i < 1000; i++) {

                counteer.increment();

            }

        }

        public static void main(String[] args) throws InterruptedException {

            Counteer counter = new Counteer();

            SyncThread t1 = new SyncThread(counter);

            SyncThread t2 = new SyncThread(counter);

            t1.start();

            t2.start();

            t1.join();

            t2.join();


            System.out.println("Final Count: " + counter.getCount());

        }




}
