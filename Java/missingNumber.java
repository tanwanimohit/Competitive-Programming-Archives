import java.util.*;
import java.io.*;
public class missingNumber {
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
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		FastReader in = new FastReader();
		int testcases= Integer.parseInt(in.nextLine());
		int t=0;
		while(t<testcases) {
			int n = Integer.parseInt(in.nextLine());
			int[ ] givenArray = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			long totalSum = (n*(n+1))/2;
			long sum = Arrays.stream(givenArray).sum();
			out.println(totalSum-sum);
			
			t++;
		}
}
}
