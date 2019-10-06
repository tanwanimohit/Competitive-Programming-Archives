import java.util.*; 
import java.io.*;

public class equlibriumPt {
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
		
		int testCases = Integer.parseInt(in.nextLine());
		int t=0;
		
		while(t<testCases) {
			int n = Integer.parseInt(in.nextLine());
			int [] givenArray = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int sum= Arrays.stream(givenArray).sum();
			int leftSum=0;
			int flag=0;
			for(int i=0;i<n;i++)
			{
				sum-=givenArray[i];
				if(sum==leftSum) {
					out.println(i+1);
					flag=1;
					break;
				}
				leftSum+=givenArray[i];
			}
			if(flag==0) {
				out.println(-1);
			}
			t++;
		}
	}
}
