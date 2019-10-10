import java.io.*;
import java.util.*;
public class longestCommonSubsequence {
	
	static int lcsDynamic(char[] input1,char[] input2) {
		int [][] temp = new int[input1.length+1][input2.length+1];
		int max=0;
		for(int i=1;i<input1.length+1;i++) {
			for(int j=1;j<input2.length+1;j++) {
				if(input1[i-1]==input2[j-1]) {
					temp[i][j]=temp[i-1][j-1]+1;
				}else {
					temp[i][j]= Math.max(temp[i-1][j],temp[i][j-1]);
				}
				if(temp[i][j]>max) {
					max=temp[i][j];
				}
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		String String2= "abcdaf";
		String String1="acbcf";
		
		System.out.println(lcsDynamic(String1.toCharArray(),String2.toCharArray()));
	}

}
