package Basics;
import java.util.Scanner;
public class circleArea {
    public class Main {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            float r = sc.nextFloat();
            double pi = Math.PI;
            double circum = 2*pi*r;
            double area = pi*r*r;
            System.out.printf("%.2f",circum);
            System.out.println();
            System.out.printf("%.2f",area);
        }
    }

}
