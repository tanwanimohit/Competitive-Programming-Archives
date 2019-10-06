import java.util.*;
import java.io.*;

public class leadersInAnArray {
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
		
		int testCases = Integer.parseInt(in.nextLine());
		int t=0;
		
		while(t<testCases) {
			int n = Integer.parseInt(in.nextLine());
			int [] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			List<Integer> list = new ArrayList<Integer>();
			
			int l = n-2;
			int r =n-1;
			int max=data1[r];
			list.add(max);
			for(int i=0;i<n-1;i++) {
				if(data1[l]>=max) {
					max=data1[l];
					list.add(max);
				}
				l--;
			}
			Collections.reverse(list);
			list.stream().forEach(nb->out.print(nb+" "));
			out.println();
			t++;
		}
		out.flush();
	}

}
