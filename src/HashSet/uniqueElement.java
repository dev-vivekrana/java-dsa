package HashSet;

import java.util.HashSet;

public class uniqueElement {
    static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        constraints -> even duplicates
        int[]arr = {1,2,3,4,4,3,3,3,1};
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]))set.remove(arr[i]);
            else set.add(arr[i]);
        }
        System.out.println(set);
    }
}
