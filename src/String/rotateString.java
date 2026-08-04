package String;

import java.util.Arrays;

public class rotateString {
    static boolean rotateString(String s, String goal) {
        char[] arr = s.toCharArray();
        for(int k=0;k<arr.length;k++){
            char temp = arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
            System.out.println(Arrays.toString(arr));
            String output = String.valueOf(arr);
            System.out.println(output);
            if(output.equals(goal))return true;
        }
        return false;
    }
    static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
}
