package String;

import java.util.Arrays;

public class sortWordsOfSentence {
    static void main(String[] args) {
        String str = "ek machli paani me gayi chapaak";
        String[] words = str.split(" ");
        int value =0;
        for(int i=0;i<words.length-1;i++){
            int j=i+1;
            while(j<words.length){
                value = words[i].compareTo(words[j]);
                if(value>0){
                    String temp = words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
