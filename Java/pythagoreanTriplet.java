import java.util.*;
import java.io.*;

public class pythagoreanTriplet {
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
			int[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(data1);
			int flag=0;
			for(int i=n-1;i>=0;i--) {
				int j=0;
				int k=i-1;
				while(j<k) {
					if(Math.pow(data1[i],2)==Math.pow(data1[j],2)+Math.pow(data1[k],2)) {
						flag=1;
						break;
					}
					else if(Math.pow(data1[i],2)>Math.pow(data1[j],2)+Math.pow(data1[k],2)){
						j++;
					}
					else {
						k--;
					}
				}
				if(flag==1) {
					break;
				}
			}
			if(flag==1) {
				out.println("Yes");
			}else {
				out.println("No");
			}
			t++;
		}
		out.flush();
	}
	
}
