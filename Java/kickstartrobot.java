import java.util.*;

import java.io.*;

public class kickstartrobot {
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
			int N =data1[0];
			int R =data1[1];
			int C =data1[2];
			int SR =data1[3];
			int SC =data1[4];
			
			
			int[][] track = new int[R][C];
			for (int[] row : track) 
	            Arrays.fill(row, 0);
			
			track[SR-1][SC-1]=1;
			String command = in.nextLine();
			int curR=SR-1;
			int curC=SC-1;
			for(int i =0;i<N;i++) {
				
				if(command.charAt(i)=='W') {
					curC--;
					while(track[curR][curC]==1) {
						curC--;
					}
					track[curR][curC]=1;
				}
				if(command.charAt(i)=='E') {
					curC++;
					while(track[curR][curC]==1) {
						curC++;
					}
					track[curR][curC]=1;
				}
				if(command.charAt(i)=='N') {
					curR--;
					while(track[curR][curC]==1) {
						curR--;
					}
					track[curR][curC]=1;
				}
				if(command.charAt(i)=='S') {
					curR++;
					while(track[curR][curC]==1) {
						curR++;
					}
					track[curR][curC]=1;
				}

			}
			out.println("Case #"+(t+1)+": "+(curR+1)+" "+(curC+1));			
		t++;
		}
		
}
}
