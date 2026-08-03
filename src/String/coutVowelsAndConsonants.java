package String;

import java.util.Scanner;

public class coutVowelsAndConsonants {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int vowels =0,consonants=0,whiteSpace=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            switch (ch){
                case 'a','e','i','o','u'-> vowels++;
                case ' '-> whiteSpace++;
                default -> consonants++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonants : "+consonants);
        System.out.println("Whitespaces : "+whiteSpace);
    }
}
