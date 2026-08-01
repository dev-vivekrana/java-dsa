package multiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class setMatrixZero {
    static void main(String[] args) {
        int[] arr = new int[]{9,2,3,7,0,5};
        int p=0 , q=0;
        for(int i=0;i<arr.length;i++){
            if(arr[q]==0){
                while(p<arr.length){
                    System.out.println("start");
                    arr[p]=0;
                    p++;
                }
                break;
            }
            q++;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(p);
        System.out.println(q);
    }
}
