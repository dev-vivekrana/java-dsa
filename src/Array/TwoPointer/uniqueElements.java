package Array.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class uniqueElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count =0;
        int i =0;
        int j=i+1;
        while(j<n){
            if(arr[i]==arr[j]) j++;
            else if(arr[i]!=arr[j]){
                count++;
                arr[i+1]=arr[j];
                i++;
                j++;
            }
        }
        if(n!=0)count++;
        System.out.println("No of unique elements is : "+count);
        System.out.println(Arrays.toString(arr));
        System.out.println(i);
    }
}
