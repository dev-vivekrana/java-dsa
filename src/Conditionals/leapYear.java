package Conditionals;
import java.util.Scanner;
public class leapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
//         leap year conditions
//        1. year must be multiple of 400
//        OR
//        2. if a year  is divisible by 4 then should not be divisible by 100

        if( (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0)) System.out.println(year + " is a leap year");
        else System.out.println("Not a leap year");
    }
}
