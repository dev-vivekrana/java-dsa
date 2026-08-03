package String;

import java.util.Scanner;

public class capitalizeFirstandLastChar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        String ans = "";
        // first convert the string into the array so we will split it;
        String[] str = s.split(" ");
//        Now use enhanced for loop to iterate over each word;
        for(String word :str){
            if(word.length()<=2) ans = ans + word.toUpperCase() + " ";
            else ans = ans + Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length()-1) + Character.toUpperCase(word.charAt(word.length()-1)) + " ";
        }
        System.out.println(ans);
    }
}