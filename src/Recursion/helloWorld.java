package Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class helloWorld {
    static void fun(int n){
        if(n==0) return;
        System.out.println("Hello, World");
        fun(n-1);
        /* by default yha pr return hai */
    }
    static void main(String[] args) {
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}
