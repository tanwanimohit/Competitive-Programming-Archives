import java.util.*;

import java.io.*;


public class mergeSortedArrays {
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
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		FastReader in = new FastReader();
		int testcases= Integer.parseInt(in.nextLine());
		int t=0;
		while(t<testcases) {
			String lengths = in.nextLine();
			int[] array1 =Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] array2 =Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			int[] result = Arrays.copyOf(array1, array1.length + array2.length);
			  System.arraycopy(array2, 0, result, array1.length, array2.length);
			Arrays.sort(result);
			Arrays.stream(result).forEach(nb->System.out.print(nb+" "));
			t++;
		}
	}
}
