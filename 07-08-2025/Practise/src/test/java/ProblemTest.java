package test.java;

import main.java.Problem;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemTest {

    Problem problem = new Problem();
    @Test
    public void reverseTable() {
        int[] arr = {50, 45, 40, 35, 30, 25, 20, 15, 10, 5};
        int[] actual = problem.reverseTable(5);
        for(int i=0;i<10;i++) {
            assertEquals(arr[i],actual[i]);
        }
    }

    @Test
    public void printLetters(){
        StringBuffer expected = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        StringBuffer actual = problem.printletter();
        assertEquals(expected.toString(),actual.toString());
    }

    @Test
    public void printASCII(){
        int[] expected = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
        int[] actual = problem.printAscii();
        for(int i=0;i<26;i++) {
            assertEquals(expected[i],actual[i]);
        }
    }


    @Test
    public void factorial(){
        int expected = 120;
        int actual = problem.factorial(5);
        assertEquals(expected,actual);
    }

    @Test
    public void count(){
        int[] arr = {45,65,0,0,-3,-4};
        int[] expected = {2,2,2};
        int[] actual = problem.numberCounts(arr);
        for(int i=0;i<expected.length;i++){
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void values(){
        int[] arr = {50,45,2,3,15,25,1};
        int[] expected = {50,1};
        int[] actual = problem.findLargestSmallest(arr);
        for(int i=0;i<expected.length;i++){
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void sum(){
        int actual = problem.sum();
        assertEquals(1683,actual);

    }
     @Test
    public void ones(){
        int actual = problem.onescomplement(5);
        assertEquals(-6,actual);
    }

    @Test
    public void two(){
        int actual = problem.twoscomplement(5);
        assertEquals(-5,actual);
    }

    @Test
    public void fabnocci(){
        int[] expected = {0,1,1,2,3};
        int[] actual = problem.faboncciSeries(5);
        for(int i=0;i<actual.length;i++){
            assertEquals(expected[i],actual[i]);
        }
    }
}