public class DataType {


        // Variable argument
        public static void main(String...args){

            System.out.println("args[0]: "+args[0]);
            System.out.println("args[1]: "+args[1]);
            System.out.println("Addition: "+(args[0]+args[1]));

            // Convert the String to int data type
            //using WRAPPER CLASS(Integer)
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println(" New Addition is: "+(num1+num2));

            //Convert the String to a double data type
            double d1 = Double.parseDouble(args[2]);
            double d2 = Double.parseDouble(args[3]);
            System.out.println("Decimal Addition is: "+(d1+d2));
            int x=234;
            x=x+100;
            System.out.println("X: "+x);
            String y = "123";
            y= y+100;
            System.out.println("Y: "+y);

            // Convert the integer to a String
            System.out.println("New Str: "+String.valueOf(x)+200);
            String str = String.valueOf(x);
            str = str+100;
            System.out.println("Str: "+str);

            //Task
            System.out.println("Java"+20+30);
            System.out.println(20+30+"Java"+20+30);
            //System.out.println("Args[4]: "+args[4]);
            System.out.println("Welcome");

        }
}
