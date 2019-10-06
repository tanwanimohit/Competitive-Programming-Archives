
import java.util.*;
import java.io.*;

public class bitplusplus {
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
		int operations = Integer.parseInt(in.nextLine());
		int i =0;
		int acc=0;
		while(i<operations) {
			String curr = in.nextLine();
			if(curr.equals("++X") || curr.equals("X++")) {
				acc++;
			}else {
				acc--;
			}
	
			i++;
		}
		
		
		out.println(acc);
		
		
		
		

		}
	}