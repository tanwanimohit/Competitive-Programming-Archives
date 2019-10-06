import java.util.*;
import java.io.*;
public class tram {
	public static PrintWriter out;
	static class FastReader{
		BufferedReader br;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine() {
			String str = "";
			try
			{
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
		int stops = Integer.parseInt(in.nextLine());
		int i = 0;
		int capacity=0;
		int sum = 0;
		
		while(i<stops) {
			int[] people = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			sum += people[1]-people[0];
			if(sum>capacity) {
				capacity=sum;
			}
			
			
			i++;
		}
		out.println(capacity);
	}
}
