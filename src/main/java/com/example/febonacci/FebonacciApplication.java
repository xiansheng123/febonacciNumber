package com.example.febonacci;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;

@SpringBootApplication
public class FebonacciApplication {

    public static void main(String[] args) {
        febonacci1 (100);
    }

    private static void febonacci1(int number) {
        BigInteger a = new BigInteger ("0");
        BigInteger b = new BigInteger ("1");
        BigInteger c = new BigInteger ("1");
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
}
