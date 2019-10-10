import java.util.*;
import java.io.*;
public class kadanesalgo {
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
			int length = Integer.parseInt(in.nextLine());
			int[ ]givenArray = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//			method1
//			int cursum = 0;
//			int maxsum = givenArray[0];
//			for(int i =0;i<givenArray.length;i++) {
//				cursum+=givenArray[i];
//				if(cursum>maxsum) {maxsum=cursum;}
//				if(cursum<=0) {cursum=0;};
//				if(cursum!=0) {maxsum=Math.max(cursum,maxsum);}
//			}
			
			
// method 2
			int cursum = givenArray[0];
			int maxsum = givenArray[0];
			for(int i =1;i<givenArray.length;i++) {
				cursum =Math.max(givenArray[i],cursum+givenArray[i]);
				maxsum = Math.max(cursum, maxsum);
			}
			
			out.println(maxsum);
			t++;
		}
	}
}
