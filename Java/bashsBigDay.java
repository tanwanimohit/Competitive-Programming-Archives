import java.io.*;
import java.util.*;


public class bashsBigDay {
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
		
		int length = Integer.parseInt(in.nextLine());
		int[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] factors= new int[100000];
		Arrays.fill(factors, 0);
		
		int t=0;
		while(t<length) {
			
			int strength = data1[t];
			int root =(int)Math.sqrt(strength);
			
			for(int i=2;i<=root;i++) {
				
				if(strength%i==0) {
					factors[i]++;
				}
				
				while(strength%i==0) {
					strength/=i;
				}
			}
			
			
			if(strength>1) {
				factors[strength]++;
			}
			t++;
		}
		
		
		int ans =1;
		ans = Math.max(ans, Arrays.stream(factors).max().getAsInt());
		
		out.println(ans);
		out.flush();
	}
}
