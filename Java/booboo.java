import java.io.*;
import java.util.*;

public class booboo {
	public static PrintWriter out;
	static class FastReader{
		BufferedReader br;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		FastReader in = new FastReader();
		int[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int totalDays = data1[1];
		long[] timeForEachQuestion = Arrays.stream(in.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
		int n = data1[0];
		long lo = timeForEachQuestion[0];
		for(long i:timeForEachQuestion) {
			if(i>=lo) {
				lo=i;
			}
		}
		long hi = Arrays.stream(timeForEachQuestion).sum();
		
		
		while(lo<hi) {
			long x = lo + (hi-lo)/2;
			int requiredDays=1; long currentLoad=0;
			for(int i =0;i<n;i++) {
				if(currentLoad+timeForEachQuestion[i]<=x) {
					currentLoad+=timeForEachQuestion[i];
				}else {
					requiredDays++;
					currentLoad=timeForEachQuestion[i];
				}
			}
			
			if(requiredDays<=totalDays) {
				hi=x;
			}else {
				lo=x+1;
			}
		
		
		
			
			
		}
		out.println(lo);
		out.flush();
		
		
		
		
		
	}

}
