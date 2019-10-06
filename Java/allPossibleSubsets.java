import java.io.*;
import java.util.*;

public class allPossibleSubsets {
	
	static boolean filterCharacters(int[] b, int no) {
		int i=0;
		int sum =0;
		while(no>0) {
			if((no&1)==1) {
				sum+=b[i];
			}
			no=no>>1;
			i++;
		}
		return (sum==11)?(true):(false);
	}

	static void getCharacters(int[] a) {
		int n = a.length;
		int range = (1<<n)-1;
		int flag=0;
		for(int i=0;i<=range;i++) {
			if(filterCharacters(a,i)) {
				flag=1;
				break;
			}
		}
		
		System.out.println((flag==1)?"YES":"NO");
		
	}
	
	
public static void main(String[] args) {
	int[] notes = {1,2,4,8,16};
	
	getCharacters(notes);
	
}
}
