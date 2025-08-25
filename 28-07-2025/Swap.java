package pack2;

public class Swap {
    public void swapping(int a,int b){

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String args[]){
        Swap swap = new Swap();
        swap.swapping(10,20);
    }
}
