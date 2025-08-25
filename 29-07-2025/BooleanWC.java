package pack2;

public class BooleanWC {
    public static void main(String args[]){

        //ParseBoolean
        String str = "true";
        boolean bool1 = Boolean.parseBoolean(str);
        System.out.println(bool1);

        //valueOf
        String value = "false";
        Boolean bool2 = Boolean.valueOf(value);
        System.out.println(bool2);


        //booleanValue
        boolean b2 = bool2.booleanValue();
        System.out.println(b2);

        Integer i = 10;
        int a = i;
        System.out.println(a);



    }
}
