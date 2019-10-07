package lecture10;

import lecture8.frequencycount;

import java.util.Arrays;

public class lexopermutation {
    public static void main(String[] args) {
        String str= "abc";
        int freq[]=frequency(str);
        System.out.println(Arrays.toString(freq));
        lexo("",str.length(),freq);
    }
    public static int[] frequency(String str){
        int freq[]=new int [26];
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        return freq;
    }
    public static void lexo(String processed,int length,int freq[]){
        if(length==0){
            System.out.println(processed);
            return ;
        }
        for (int i=0;i< freq.length;i++){
            if (freq[i]>0){
                freq[i]--;
                lexo(processed+(char)(i+'a'),length-1,freq);
                freq[i]++;
            }
        }
    }
}
