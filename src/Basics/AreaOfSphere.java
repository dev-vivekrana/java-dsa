package Basics;
import java.util.Scanner;
public class AreaOfSphere {
    public class Main {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            double r = sc.nextDouble();
            double pi = Math.PI;
            double area = 4 * pi * r * r;
            System.out.println(area);

        }
    }
}
