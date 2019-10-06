import java.util.*;
import java.io.*;

public class reverseStringWords {
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
		
		int testCases = Integer.parseInt(in.nextLine());
		int t=0;
		
		while(t<testCases) {
			String[] strings = in.nextLine().split("\\.");
			Collections.reverse(Arrays.asList(strings));
			out.println(String.join(".", strings));
			t++;
		}
		out.flush();
	}
	
}
