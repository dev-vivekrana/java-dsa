package String;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class toggleCharacters {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String newStr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
//            jab hum compare krte hai char with equals to sign so it automatically changes to its ascii values so we dont need manual type conversion
            if(ch>='a'&&ch<='z'){
                    newStr = newStr + (char)(ch - 32);
            }
            else if(ch>='A'&&ch<='Z'){
                newStr = newStr + (char)(ch + 32);
            }
        }
        System.out.println(newStr);
    }

}