import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main1
{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        HashMap<String,Double> studentScore = new HashMap<String,Double>();

        System.out.println("Enter the StudentName1: ");
        String s1 = s.next();
        System.out.println("Enter the StudentScore1: ");
        double m1 = s.nextDouble();
        studentScore.put(s1,m1);

        System.out.println("Enter the StudentName3: ");
        String s3 = s.next();
        System.out.println("Enter the StudentScore3: ");
        double m3 = s.nextDouble();
        studentScore.put(s3,m3);






        System.out.println(studentScore);


    }

}