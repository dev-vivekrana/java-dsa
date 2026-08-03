package String;

import java.util.Scanner;

public class Palindrome2pointer {
    static boolean isPalindrome(String s){
        int i =0 , j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else return false;
        }
        return true;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
