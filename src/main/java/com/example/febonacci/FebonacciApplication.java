package com.example.febonacci;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class FebonacciApplication {

    public static void main(String[] args) {

        // 1 print febonacci array 0 to 100
        // febonacci(100);

        // 2 print chris tree
        //chrisTree ();

        //3 calculate Char
        //calculateChar("12b3rrr  yy5555ldfgjdflkjgdfgjdfij");

        //4 order number by bubble sort
        printOrderByNumberDesc();
       // printOrderByNumberDesc2();
    }

    private static void febonacci(int number) {
        BigInteger a = new BigInteger ("0");
        BigInteger b = new BigInteger ("1");
        BigInteger c;
        StringBuilder sb = new StringBuilder ();

        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                sb.append ("0;");
                continue;
            }
            sb.append (a.add (b) + ";");
            c = a.add (b);
            a = b;
            b = c;
        }
        System.out.println (sb.toString ());
    }

    //  an= a1+(n-1)*d
    private static void chrisTree() {
        for (int i = 1; i <= 5; i++) {
            printStart (1 + (i - 1) * 2, i, 5);
        }
        for (int i = 1; i <= 5; i++) {
            printStart (1 + (i - 1) * 2, i, 5);
        }
        System.out.println (printSpace (1, 5).append ("*"));
        System.out.println (printSpace (1, 5).append ("*"));
    }

    private static StringBuilder printSpace(int LineNo, int max) {
        StringBuilder sb = new StringBuilder ();
        int numberOfSpace = max - LineNo;
        for (int j = 0; j < numberOfSpace; j++) {
            sb.append (" ");
        }
        return sb;
    }

    private static void printStart(int i, int lineNo, int max) {

        StringBuilder sb = printSpace (lineNo, max);
        for (int j = 0; j < i; j++) {
            sb.append ("*");
        }
        System.out.println (sb.toString ());
    }

    /*
     * ASK range as below:
     *  number(0 - 9)  48 to 57
     * A to Z：65到90 a to z：97到122
     * space 32
     * */
    private static void calculateChar(String str) {
        char[] chars = str.toCharArray ();
        int number = 0;
        int letter = 0;
        int space = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) {
                number++;
            }
            if ((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122)) {
                letter++;
            }
            if (chars[i] == 32) {
                space++;
            }
        }
        System.out.println ("number:" + number + " letter:" + letter + " space:" + space);
    }

    private static void printOrderByNumberDesc(){
        System.out.print ("please input 3 number");
        Scanner scanner =new Scanner (System.in);
        int num1 = scanner.nextInt ();
        int num2 =scanner.nextInt ();
        int num3 =scanner.nextInt ();
        scanner.close ();
        int temp;
        if (num1 >num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 >num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 >num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("order by desc："+num3+"  "+num2+"   "+num1  );
    }

    private static void printOrderByNumberDesc2(){
        System.out.print ("please input 3 number");
        Scanner scanner =new Scanner (System.in);
        int num1 = scanner.nextInt ();
        int num2 =scanner.nextInt ();
        int num3 =scanner.nextInt ();
        scanner.close ();
        List<Integer> integers = Arrays.asList (num1, num2, num3);
        Collections.sort (integers);
        System.out.println("order by desc："+integers.get (0)+"  "+ integers.get (1)+"   "+integers.get (2)  );
    }
}
