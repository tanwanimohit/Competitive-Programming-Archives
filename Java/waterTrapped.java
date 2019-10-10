import java.util.*;
import java.io.*;

public class waterTrapped {
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
			
			int [] arr1 = new int[n];
			int [] arr2 = new int[n];
			
			int max1=0;
			for(int i =0;i<n;i++) {
				if(data1[i]>max1) {
					max1=data1[i];
				}
				arr1[i]=max1;
			}
			
			int max2=0;
			
			for(int i=n-1;i>=0;i--) {
				if(data1[i]>max2) {
					max2=data1[i];
				}
				arr2[i]=max2;
			}
			
			int totalWater=0;
			
			for(int i=0;i<n;i++) {
				totalWater+= Math.min(arr1[i], arr2[i])-data1[i];
			}
			
			out.println(totalWater);

			
			t++;
		}
		out.flush();
	}
	
	
	
}
