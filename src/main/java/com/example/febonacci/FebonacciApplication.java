package com.example.febonacci;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;

@SpringBootApplication
public class FebonacciApplication {

    public static void main(String[] args) {
        //febonacci1 (100);
        chrisTree ();
    }

    private static void febonacci1(int number) {
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

}
