package pack2;

public class ExampleThrows {

    public static void itemPurchase(double amount) throws IllegalArgumentException{
        if(amount<100){
            System.out.println("Insufficient Amount....");
        }else{
            System.out.println("Amount Sufficient..");
        }
    }


    public static void main(String args[]){

        try{
            itemPurchase(50);
        }catch (IllegalArgumentException ie){
            ie.printStackTrace();
        }
    }
}
