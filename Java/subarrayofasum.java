import java.util.*;
import java.io.*;

public class subarrayofasum {
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
			int [] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int reqSum = data1[1];
			int [] givenArray = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			
			int header=0;
			int wsum=0;
			int flag=0;
			
			for(int i =0;i<givenArray.length;i++) {
				
				wsum+=givenArray[i];
				while(wsum>reqSum) {wsum-=givenArray[header];header++;}
				
				if(wsum==reqSum) {
					flag=1;
					out.println((header+1)+" "+(i+1));
					break;
				}
				
				
				
			}
			if(flag==0) {
				out.println(-1);
			}
				
		t++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int testCases = Integer.parseInt(in.nextLine());
//		int t=0;
//		
//		while(t<testCases) {
//			int flag=0;
//			int [] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//			int reqSum = data1[1];
//			int [] givenArray = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//			int i=0;
//			int x=0;
//			
//			for(i=0;i<givenArray.length;i++) {
//				int curSum=0;
//				for(x=i;x<givenArray.length;x++) {
//					curSum+=givenArray[x];
//					if(curSum==reqSum) {
//						flag=1;
//					}
//					if(flag==1) {
//						break;
//					}
//					
//				}
//				if(flag==1) {
//					break;
//				}
//			}
//			if(flag==0) {
//				out.println(-1);
//			}else {
//				out.println(i+1+" "+(x+1));	
//			}
//			t++;
//		}
	}

}
