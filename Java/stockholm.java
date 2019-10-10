import java.util.*;
import java.io.*;
public class stockholm {
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
				str= br.readLine();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args) {
		FastReader in = new FastReader();
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		int closets = Integer.parseInt(in.nextLine());
		int i =0;
		int leftZero = 0;
		int leftOne = 0;
		int rightZero = 0;
		int rightOne = 0;
		while(i<closets) {
			int[] closet = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			if(closet[0]==0) {
				leftZero++;
			}else {
				leftOne++;
			}
			if(closet[1]==0) {
				rightZero++;
			}else {
				rightOne++;
			}
			i++;
		}
		int t =Math.min(leftZero,leftOne)+Math.min(rightZero,rightOne);
		out.println(t);
		
	}
}


















