import java.util.*;
import java.io.*;

public class team {
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
		int questions = Integer.parseInt(in.nextLine());
		int solved=0;
		int i=0;
		while(i<questions) {
			int sum=0;
			int[] choices = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int x:choices) {
				sum+=x;
			}
			if(sum>=2) {
				solved++;
			}
			i++;
		}
		
		out.println(solved);
		
		
		
		
		

		}
	}