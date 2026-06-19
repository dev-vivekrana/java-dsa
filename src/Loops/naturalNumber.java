package Loops;

import java.util.Scanner;

public class naturalNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(i+1 + " ");
        }
    }

}
