import java.util.*;

import java.io.*;

public class reverseArrayGroup {
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
			int[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n=data1[0];
			int k=data1[1];
			
			
			List<Integer> tempList = new ArrayList<Integer>();
			List<Integer> finalList = new ArrayList<Integer>();
			
			
			
			
			int[] data2 = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			
			for(int i=0;i<n;i++)
			{
				tempList.add(data2[i]);
				if((i+1)%k==0){
					Collections.reverse(tempList);
					finalList.addAll(tempList);
					tempList.clear();
				}
			}
			
			if((n%k)!=0) {
				Collections.reverse(tempList);
				finalList.addAll(tempList);
			}
			
			finalList.stream().forEach(nb->out.print(nb+" "));
			out.println();
			t++;
		}
		
		out.flush();
	}
}
