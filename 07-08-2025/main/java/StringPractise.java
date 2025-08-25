package main.java;

import java.util.Arrays;

public class StringPractise {

//            1.    Java program to print the highest frequency character in a String.
//            2.	Java program to Replace First Occurrence Of Vowel With ‘-‘ in String.
//            3.	Java program to count alphabets, digits and special characters.
//            4.	Java program to remove blank space from string.
//            5.	Java program to Concatenate two strings.
    public void frequency(String message){
        char[] ch = message.toCharArray();
        int[] arr = new int[message.length()];
        String[] arr1 = new String[message.length()];
        int count = 0;
        for(int i=0;i<message.length();i++){
            for(int j=0;j<message.length();j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            arr[i] = count;
        }
        System.out.println();
    }

    public void replacing(String msg){
        String vowels = "aeiouAEIOU";
        for (int i = 0; i<msg.length();i++){
            if (vowels.indexOf(msg.charAt(i)) != -1) {
                String replaced = msg.replace(msg.charAt(i),'-');
                System.out.println(replaced);
                break;
            }
        }

//        String changed = msg.toString();
//        System.out.println(changed);
    }

//    public void concatStrings(String one,String two){
//        String word = one.concat(two);
//        System.out.println("After concatinating of two Strings: "+word);
//    }
//
//    public void removeSpace(String message){
//        String newMessage = message.replaceAll("\\s","");
//        System.out.println("After removing the spaces: "+newMessage);
//    }
//
//    public void countAll(String message){
//        int alphabetCount = 0;
//        int numbersCount = 0;
//        int specialCharCount = 0;
//        char[] ch = message.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(Character.isAlphabetic(ch[i])){
//                alphabetCount++;
//            } else if (Character.isDigit(ch[i])) {
//                numbersCount++;
//            }else{
//                specialCharCount++;
//            }
//        }
//        System.out.println("Alphabet: "+alphabetCount);
//        System.out.println("Digits: "+numbersCount);
//        System.out.println("SpecailCharCount: "+specialCharCount);
//    }
}
