package Array;

import java.util.Arrays;
import java.util.Scanner;

public class rightRotate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int temp = arr[arr.length-1];
//        now we have to right rotate the array by 1
        for(int k=arr.length-2;k>=0;k--){
            arr[k+1]= arr[k];
        }
        arr[0]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
