package pack2;

import java.util.Scanner;

public class TestMain {

    private Scanner s;
    public TestMain(){
        this.s = new Scanner(System.in);
    }
    public static void main(String args[]){
        TestMain tm = new TestMain();

        System.out.println("Enter the value");;
        int val = tm.s.nextInt();
        System.out.println(val);
    }
}
