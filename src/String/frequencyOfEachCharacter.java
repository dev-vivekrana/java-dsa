package String;

import java.util.Scanner;

public class frequencyOfEachCharacter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int[] freq = new int[128];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch] = freq[ch] + 1 ;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)i + "-" + freq[i]);
            }
        }
    }
}