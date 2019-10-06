
import java.io.*;
import java.util.*;

public class boyOrGirl {
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
		String name = in.nextLine();
		String[] temp= name.split("(?!^)");
		List<String> checkName  = Arrays.asList(temp);
		Set<String> s = new HashSet<String>(checkName);
		out.println((s.size()%2==0)?("CHAT WITH HER!"):("IGNORE HIM!"));
	}
}
