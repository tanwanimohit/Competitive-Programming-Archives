import java.io.*;
import java.util.*;

public class beautifulMath {
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
	public static void main(String[] args){
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		FastReader in = new FastReader();
		int[] inputs = Arrays.stream(in.nextLine().split("[+]")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(inputs);
		String result="";
		for(int i=0;i<inputs.length;i++) {
			if(i==0) {
				result+=Integer.toString(inputs[i]);
			}
			else {
				result+="+"+Integer.toString(inputs[i]);
			}

		}
		out.println(result);
	}
	
}
