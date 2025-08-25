import java.util.Locale;

public class PalindromeCheck {
    public void checkPalindrome(String text){
        StringBuffer text1 = new StringBuffer(text);
        String reverse_num = text1.reverse().toString();
        if(text.equalsIgnoreCase(reverse_num)){
            System.out.println("Given text is a palindrome");
        }else{
            System.out.println("Given text is not a palindrome");
        }
    }

    public static void main(String args[]){

        PalindromeCheck palindromeCheck = new PalindromeCheck();
        palindromeCheck.checkPalindrome("madam");


    }
}
