package Loops;

import java.util.Scanner;

public class StrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int copyN = n;
        int sum = 0;
        while(n!=0){
            int factorial = 1;
            int lastDigit = n%10;
            for(int i=1;i<=lastDigit;i++){
                factorial = factorial * i;
            }
            sum = sum + factorial;
            n/=10;
        }
        System.out.println(sum==copyN?"Strong Number":"Not Strong Number");
    }
}
