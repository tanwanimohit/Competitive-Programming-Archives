import java.io.*;
import java.util.*;

public class bearMatching {
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
		String input = in.nextLine();
		
		int lasti=0;
		int i=0;
		int j=i+3;
		int count=0;
		int length=input.length();
		int valuetoadd=0;
		
		while(j<length) {
			if(input.substring(i,j+1).equals("bear")){
				lasti=i;
				valuetoadd=lasti+1;
			}
			count+=valuetoadd;
			
			i++;
			j++;
		}
		
		out.println(count);
		out.flush();
		
		
		
	}

}
