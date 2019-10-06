import java.io.*;
import java.util.*;
import java.math.*;

public class tPrime {
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
	
	
	static String checkTprime(int a) {
		BigInteger b = new BigInteger(String.valueOf((int)Math.sqrt(a)));
		return (Math.sqrt(a)==(int)Math.sqrt(a) && b.isProbablePrime(1))?"YES":"NO";
	}
	
	public static void main(String[] args) {
		out= new PrintWriter(System.out);
		FastReader in = new FastReader();
		int n = Integer.parseInt(in.nextLine());
		
		int[] inp = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int t=0;
		
		while(t<n) {
			
			out.println(checkTprime(inp[t]));
			
			
			t++;
		}
		
		out.flush();
	}

}
