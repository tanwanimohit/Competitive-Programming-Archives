import java.io.*;
import java.util.*;

public class wormsCodeForces {
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
	
	static int greatestAtMost(int n,int[]a){
		int l=0;
		int r=a.length-1;
		while(l<r) {
			int mid = (l+r+1)/2;
			if(a[mid]<=n) {
				l=mid;
			}
			else {
				r=mid-1;
			}
		}
	return l;
	}
	
	public static void main(String[] args) {
		
		out = new PrintWriter(System.out);
		FastReader in = new FastReader();
		int piles = Integer.parseInt(in.nextLine());
		int[] wormsInEachPile = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] startingLabel = new int[piles];
		startingLabel[0]=1;
		for(int i=0;i<piles-1;i++) {
			startingLabel[i+1]=startingLabel[i]+wormsInEachPile[i];
		}
		int juicyWorms = Integer.parseInt(in.nextLine());
		int[] juicyWormsLabel =Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int t=0;
		
		while(t<juicyWorms) {
			out.println(greatestAtMost(juicyWormsLabel[t], startingLabel)+1);
			t++;
		}
		
		out.flush();
	}

}
