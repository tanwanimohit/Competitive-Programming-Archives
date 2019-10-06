import java.io.*;
import java.util.*;

public class maximizeXORrange {
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
	
	static int maximizeXOR(int a, int b) {
		int c = a^b;
		int msb=0;
		
		while(c>0) {
			msb++;
			c>>=1;
		}
		
		int maxXOR =0;
		int two =1;
		while(msb-->0) {
			maxXOR+=two;
			two<<=1;
		}
		return maxXOR;
	}
	
	public static void main(String[] args) {
		out= new PrintWriter(System.out);
		FastReader in = new FastReader();
		int l = Integer.parseInt(in.nextLine());
		int r= Integer.parseInt(in.nextLine());
		
		out.println(maximizeXOR(l, r));	
		out.flush();
	}

}
