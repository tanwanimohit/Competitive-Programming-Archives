import java.io.*;
import java.util.*;

public class leverQuestion {
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
		String[] input = in.nextLine().split("");
		
		int mid=0;
		for(int i=0;i<input.length;i++) {
			if(input[i].equals("^")) {
				mid=i;
				break;
			}
		}
		int sum=0;
		
		for(int i=0;i<input.length;i++) {
			if(!input[i].equals("=")&&!input[i].equals("^")) {
				int value = Integer.parseInt(input[i]);
				
				sum+=(i-mid)*(value);
			}
		}
		
		if(sum==0) {
			out.println("balanced");
		}else if(sum>0){
			out.println("right");
		}else {
			out.println("left");
		}
		out.flush();
		
	}

}
