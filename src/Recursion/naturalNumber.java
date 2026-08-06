package Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class naturalNumber {
    static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
        /* by default yha pr return hai */
    }
    static void main(String[] args) {
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
