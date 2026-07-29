package Array.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray2Pointer {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int i = 0;
        int j = arr.length-1;
        int count = 0;
        while(i<j){
//           swap the values
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
