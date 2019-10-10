import java.util.*;
import java.io.*;
public class findtriplet{
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
		int testcases= Integer.parseInt(in.nextLine());
		int t=0;
		while(t<testcases) {
			int length = Integer.parseInt(in.nextLine());
			int [] givenArray = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(givenArray);
			int ans=0;
			for(int i=givenArray.length-1;i>=0;i--) {
				int j=0;
				int k=i-1;
				while(j<k) {
					if(givenArray[i]==givenArray[j]+givenArray[k]) {
						ans++;
						j++;
						k--;
					}
					else if(givenArray[i]>givenArray[j]+givenArray[k]) {
						j++;
					}
					else {
						k--;
					}
				}
			}
			if(ans==0) {
				out.println(-1);
			}else {
				out.println(ans);
			}
			
			t++;
		}
		
		
		
	}
	
	
	
	
	
	
}