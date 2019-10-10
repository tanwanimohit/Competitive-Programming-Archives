import java.io.*;
import java.util.*;

public class aggressiveCows {
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
	
	static boolean func(int x, int[] positions, int animals) {
		int cows = 1;
		int lastPosition = positions[0];
		for(int i=1;i<positions.length;i++) {
			if(positions[i]-lastPosition >= x) {
				cows++;
				if(cows==animals) return true;
				lastPosition=positions[i];
			}
		}

		return false;
	}
	
	
	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		FastReader in = new FastReader();
		int testCases = Integer.parseInt(in.nextLine());
		int t =0;
		while(t<testCases) {
			int[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int stalls = data1[0];
			int cows = data1[1];
			int[] stallPosn = new int[stalls];
			
			for(int i=0;i<stalls;i++) {
				stallPosn[i]=Integer.parseInt(in.nextLine());
			}
			Arrays.sort(stallPosn);
			int lo=1;
			int hi=stallPosn[stallPosn.length-1]-stallPosn[0];
			
			while(lo<hi) {
				int mid=(lo+hi+1)/2;
				if(func(mid,stallPosn,cows)) {
					lo=mid;
				}else {
					hi=mid-1;
				}
			}
			
			out.println(lo);
			out.flush();
			
					
					
			t++;
		}
	}
}
