
import java.io.*;
import java.util.*;

public class hqlang {
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
	
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		FastReader in = new FastReader();
		String command = in.nextLine();
		char[] cutouts = command.toCharArray();
	
			HashMap<Character,Integer> charContainer= new HashMap<Character, Integer>();
			for(char c :cutouts) {
					charContainer.put(c,1);
			}
			
			if(charContainer.containsKey('H')||charContainer.containsKey('Q')||charContainer.containsKey('9')) {
				out.println("YES");	
		}
			else {
				out.println("NO");
			}
	}
}
