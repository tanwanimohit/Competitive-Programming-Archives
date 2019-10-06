import java.io.*;
import java.util.*;

public class compareStrings {
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
	
	static boolean func(int x, String a, String b) {
		
		StringBuilder c= new StringBuilder();
		c.append(b);
		for(int i=0;i<=x;i++) {
			c.replace(i,i+1, "1");
		}
		String z = c.toString();
		if(z.compareTo(a)>=0) {
			return true;
		}else {
			return false;
		}
	}

	
	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		FastReader in = new FastReader();
		int[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int stringLength = data1[0];
		int noOfQueries = data1[1];
		String a = in.nextLine();
		String b = in.nextLine();
		int t = 0;
		int[] queryList= new int[noOfQueries];
		
		while(t<noOfQueries) {
			queryList[t]=Integer.parseInt(in.nextLine());
			t++;
		}
		
		int lo=0;
		int hi=noOfQueries;
		
		
		while(lo<hi) {
			int mid=(hi+lo)/2;
			if(func(mid,a,b)) {
				hi=mid;
			}else {
				lo=mid+1;
			}
		}
		out.println(lo);
		out.flush();
		
	}

}
