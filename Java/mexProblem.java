import java.io.*;
import java.util.*;

public class mexProblem {
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
		
		int[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int mex = data1[1];		
		int[] data2 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int i =0;
		Arrays.sort(data2);
		while(mex>data2[i]) {
			i++;
		}
		
		int operations = mex-i;
		if(data2.length==1&&data2[0]==mex) {
			out.println(1);
		}else {
			out.println(operations);
		}
		
		out.flush();
	}
}
