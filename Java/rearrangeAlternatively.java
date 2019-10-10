import java.util.*;
import java.io.*;

public class rearrangeAlternatively {
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
			int n = Integer.parseInt(in.nextLine());
			int[ ] givenArray = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int k =n-1;
			List<Integer> list = new ArrayList<Integer>();
			for(int i =0; i<givenArray.length;i++) {
				if(i<=k) {
					list.add(givenArray[k]);
					list.add(givenArray[i]);
				}else {
					break;
				}
				k--;
				
			}
			
			
			list.forEach(nb -> System.out.print(nb+" "));	
			t++;
			
		}
	}
}
