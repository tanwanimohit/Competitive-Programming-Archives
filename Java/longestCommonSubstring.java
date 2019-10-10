import java.io.*;
import java.util.*;

public class longestCommonSubstring {
	
	public static int lcs(char input1[],char input2[]) {
		int n = input1.length;
		int m = input2.length;
		
		int[][] temp = new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			temp[i][0]=0;
		}
		for(int j=0;j<=m;j++) {
			temp[0][j]=0;
		}
		int max=0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(input1[i-1]==input2[j-1]) {
					temp[i][j]=temp[i-1][j-1]+1;
				}else {
					temp[i][j]=0;
				}
				if(temp[i][j]>max) {
					max=temp[i][j];
				}
			}
			
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		String str1 ="ABBDCACB";
		StringBuilder s = new StringBuilder();
		s.append(str1);
		s.reverse();

		String reversed = s.toString();
		
//		String str2="BABA";
		
		System.out.println(lcs(str1.toCharArray(),reversed.toCharArray()));
		
	}

}
