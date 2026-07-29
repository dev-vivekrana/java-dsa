package Array.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,2,-3,4,0};
        int i = 0;
        int j = 0;
        while(i< arr.length){
//           swap the values
            if(arr[i]<0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
