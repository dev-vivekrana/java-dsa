package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    static void insertionSorting(int[] arr,int n){
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        insertionSorting(arr,n);

    }
}
