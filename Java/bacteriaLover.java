import java.io.*;
import java.util.*;

public class bacteriaLover {
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

	static int checkDays(int b) {
		int count=0;
		while(b>0) {
			if((b&1)==1) {
				b-=1;
				count++;
			}else {
				b>>=1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		out= new PrintWriter(System.out);
		FastReader in = new FastReader();
		int total = Integer.parseInt(in.nextLine());
		out.println(checkDays(total));
		out.flush();
	}

}
