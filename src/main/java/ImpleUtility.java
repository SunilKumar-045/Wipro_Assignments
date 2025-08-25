import main.UtilityClass;

public class ImpleUtility {
    public static void main(String[] args) {
        int sum = UtilityClass.add(5,5);
        int difference = UtilityClass.sub(10,5);
        int product = UtilityClass.mul(5,5);
        int result = UtilityClass.div(10,5);
        System.out.println("sum: "+sum);
        System.out.println("difference: "+difference);
        System.out.println("product: "+product);
        System.out.println("quotient: "+result);

    }
}
