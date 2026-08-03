package String;

import java.util.Scanner;

public class maximumNumberOfWords {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array of string : ");
        int length =0;
        String[] s = {"hello word","abcd","a"};
        for(String sentence :s){
            String[] ans = sentence.split(" ");
            if(ans.length>length)length= ans.length;
            }
        System.out.println(length);
        }
    }

