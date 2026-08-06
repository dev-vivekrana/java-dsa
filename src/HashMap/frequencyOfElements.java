package HashMap;

import java.util.HashMap;

public class frequencyOfElements {
    static void main(String[] args) {
        int[]arr ={1,2,2,3,4,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int freq =0;
            freq = map.getOrDefault(arr[i], 0);
            map.put(arr[i], freq +1);
        }
        System.out.println(map);
    }
}
