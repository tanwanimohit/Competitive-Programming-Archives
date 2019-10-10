
import java.io.*;

public class lexographicalOrder {
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
		String first = in.nextLine();
		String second = in.nextLine();
		first=first.toLowerCase();
		second=second.toLowerCase();
		
		int i =0;
		
		int order=0;
		
		while(i<first.length()) {
			if(first.charAt(i)<second.charAt(i)) {
				order=-1;
				break;
			}
			else if(first.charAt(i)>second.charAt(i)){
				order=1;
				break;
			}
			i++;
		}
		
		out.println(order);

		}
	}