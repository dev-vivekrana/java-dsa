package Conditionals;
import java.util.Scanner;
public class validVoter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18) System.out.println("Hello " +name + ", you are a voter.");
        else System.out.println("Hello " +name + ", you are not a voter.");

    }
}
