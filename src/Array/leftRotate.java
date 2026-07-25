package Array;

import java.util.Arrays;
import java.util.Scanner;

public class leftRotate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] temp = new int[arr.length];
//        now we have to left rotate the array by 1

        int j=0;
        for(int k=0;k<arr.length-1;k++){
           temp[k]= arr[k+1];
        }
        for(int i =arr.length-1;i<arr.length;i++){
            temp[i]=arr[j];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
    }
}
