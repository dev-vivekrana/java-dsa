package String;

import java.util.Scanner;

public class checkAnagram {
    static boolean isAnagram(String s , String t){
        int[] freq = new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-97] = freq[ch-97]+1;
            char hc = t.charAt(i);
            freq[hc-97] = freq[hc-97]-1;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(freq[ch-97]!=0) return false;
        }
        return true;
    }
    static void main() {
        String s = "taste";
        String t = "state";
        System.out.println(isAnagram(s,t));
    }
}
