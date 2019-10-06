import java.io.*;
import java.util.*;


public class numberGroupsHackerrank {
	
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
		long k = Integer.parseInt(in.nextLine());
		long length =0;
		for(long i=1;i<k;i++) {
			length+=i;
		}
		length++;
		
		long sum = 2*(length)-1;

		long currOdd =sum;
		for(long i=0;i<k-1;i++) {
			currOdd+=2;
			
			sum+=currOdd;
		}
		out.println(sum);
		out.flush();
		
		
		
		
		
	}
		

}
