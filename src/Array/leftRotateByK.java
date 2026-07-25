package Array;

import java.util.Arrays;
import java.util.Scanner;

public class leftRotateByK {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter number by which u want to left rotate array : ");
        int number = sc.nextInt();
        number = (number)%(arr.length);
        for(int j=0;j<number;j++){
            int temp = arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));


    }
}
