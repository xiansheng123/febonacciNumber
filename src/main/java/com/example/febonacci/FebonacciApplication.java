package com.example.febonacci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;

@SpringBootApplication
public class FebonacciApplication {

    public static void main(String[] args) {
       // SpringApplication.run (FebonacciApplication.class, args);
        for (int i=0;i<=1000;i++) {
            System.out.println (febonacci (i));
        }

    }

    private static BigInteger febonacci(int number)
    {
        BigInteger a =new BigInteger ("1");
        BigInteger b =new BigInteger ("1");
        BigInteger c =new BigInteger ("0") ;
        if(number==0) {
            return c;
        }
        if(number==1 || number==2){
            return a;
        }
        for (int i = 3; i <= number; i++) {
            c= a.add (b);
            a=b;
            b=c;
        }
        return c;
    }
}
