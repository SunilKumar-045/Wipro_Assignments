package pack2;
import pack1.Pack1_new;
public class PackageMain extends Pack1_new{
    public static void main(String args[]){


        System.out.println("Hello World");
        Pack1_new p1 = new Pack1_new();
        p1.var1=30;
        p1.display();
    }
}
