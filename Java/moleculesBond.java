import java.io.*;
import java.util.*;

public class moleculesBond {
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
		int a = data1[0];
		int b = data1[1];
		int c = data1[2];
		int X=(b-c+a)/2;
		int Y=(c-a+b)/2;
		int Z=(a-b+c)/2;
		if(Arrays.stream(data1).sum()%2 != 0 || X<0||Y<0||Z<0) {
			out.println("Impossible");
		}else {
			out.println(X+" "+Y+" "+Z);
		}
		
		out.flush();
		
		
	}
}
