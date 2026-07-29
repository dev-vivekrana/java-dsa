package Array.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class subArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,7,5,12};
        int target = 12;
        int i=0;
        int count =0;
        while(i<arr.length){
            int sum =0;
            int j = i;
            while(j<arr.length){
                sum = sum+arr[j];
                if(sum==target){
                    count++;
                    break;
                }
                j++;
            }
            i++;
        }
        System.out.println(count);
    }
}
