import java.util.*;
import java.io.*;

public class vasya {
	public static PrintWriter out;
	static class FastReader{
		BufferedReader br;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine() {
			String str = "";
			try
			{
				str = br.readLine();
			
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args){
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		FastReader in = new FastReader();
		int contests = Integer.parseInt(in.nextLine());
		int[] scores = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int lowest=scores[0];
		int highest=scores[0];
		int champ =0;
		
		for(int x:scores) {
			if(x<lowest) {
				champ++;
				lowest=x;
			}
			if(x>highest) {
				champ++;
				highest=x;
			}
		}
		
		out.println(champ);
		
	}
}
