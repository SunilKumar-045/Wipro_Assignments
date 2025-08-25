package main.java;

import java.util.Scanner;

public class Problem {

    Scanner s = new Scanner(System.in);
    public int[] reverseTable(int number){
        int value = 10;
        int result = 0;
        int[] tableValues=new int[10];
        for(int i=1;i<=10;i++){
            result = number*value;
            tableValues[i-1]  = result;
            System.out.println(number+" *"+value+"= "+result);
            value--;
        }
        System.out.println("---------Reversed table----------");
        System.out.println();
        return tableValues;
    }

    public StringBuffer printletter(){
        StringBuffer sb = new StringBuffer();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
            sb.append(ch);
        }
        return sb;
    }

    public int[] printAscii(){
        int[] arr = new int[26];
        int value = 0;
        for(char ch='A';ch<='Z';ch++){
            int val = ch;
            System.out.print(val+" ");
            arr[value] = val;
            value++;
        }
        return arr;
    }

    public int factorial(int number){
        int result = 1;
        for(int i=number;i>0;i--){
            result *=i;
        }
        System.out.println("The factorial of the given number: "+result);
        System.out.println("---------Factorial----------");
        return result;
    }

    public int[] numberCounts(int[] numbers){
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                positiveCount++;
            } else if (numbers[i]<0) {
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        int arr[] = {positiveCount,negativeCount,zeroCount};
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
        System.out.println();
        return arr;
    }

    public int[] findLargestSmallest(int[] arr){
        int largestValue = Integer.MIN_VALUE;
        int smallestValue = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > largestValue) {
                largestValue = arr[i];
            }else
            {
                smallestValue = arr[i];
            }
        }
        int[] result = {largestValue,smallestValue};
        System.out.println("Largest value entered: " + largestValue);
        System.out.println("Smallest value entered: " + smallestValue);
        System.out.println();
        return result;
    }

    public int sum(){
        int sum = 0;
        for(int i=100;i<=200;i++){
            if(i%9==0){
                sum+=i;
            }
        }
        System.out.println("Sum of integers which divisible by 9 from 100 to 200: "+sum);
        return sum;
    }
    public int onescomplement(int number){
        int onecomplement = ~number;
        System.out.println("One's complement of the given number...."+onecomplement);
        return onecomplement;
    }


    public int twoscomplement(int number){
        int twosComplement = (~number) + 1;
        System.out.println("Two's complement of the given number...."+twosComplement);
        return twosComplement;
    }
    public int[] faboncciSeries(int number){
        int arr[] = new int[number];
        int first = 0, second = 1;
        System.out.println("Fibonacci series up to " + number + " terms:");
        for (int i = 0; i < number; i++) {
            System.out.print(first + " ");
            arr[i] = first;
            int next = first + second;
            first = second;
            second = next;
        }
        return arr;
    }

}
