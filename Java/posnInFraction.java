import java.io.*;
import java.util.*;


public class posnInFraction {
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
		int[] input = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		double a = (double)input[0];
		double b = (double)input[1];
		int c = input[2];
		String c1 = Integer.toString(c);
		
		double divided = a/b;
		int number = (int) divided;
		double fractional= divided -number;
		
		String str = Double.toString(fractional);
		str+="000";
		
		str = str.substring(2);
		int flag=0;
		for(int i=0;i<b;i++) {
			if(str.charAt(i)==c1.charAt(0)) {
				out.println(i+1);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			out.println(-1);
		}
		
		out.flush();	
	}
	

}
