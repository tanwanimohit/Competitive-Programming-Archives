import java.io.*;
import java.util.*;


public class fixedPoint {
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
			int count =0;
			int temp =0;
			for(int i=0;i<length;i++) {
				if(data1[i]==i) {
					count++;
				}
			}
			for(int i=0;i<length;i++) {
				if(data1[i]!=i) {
					if(data1[data1[i]]==i) {
						count+=2;
						temp=1;
						break;
					}
				}
			}
			if(temp==0&&count!=length) {
				count++;
			}
			
			out.println(count);
			out.flush();
			
		}

}
