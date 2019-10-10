
import java.io.*;
import java.util.*;

public class amusingJoke {
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
		String name1 = in.nextLine();
		String name2 = in.nextLine();
		String combinedNames = name1+name2;
		String clutter = in.nextLine();
		char[] cutouts = combinedNames.toCharArray();
		if(combinedNames.length()!=clutter.length()) {
			out.println("NO");
		}else {
			HashMap<Character,Integer> charCountOriginal= new HashMap<Character, Integer>();
			for(char c :cutouts) {
				if(charCountOriginal.containsKey(c)) {
					charCountOriginal.put(c,charCountOriginal.get(c)+1);
				}else {
					charCountOriginal.put(c,1);
				}
			}
			char[] mess = clutter.toCharArray();
			HashMap<Character,Integer> charCountNew= new HashMap<Character, Integer>();
			for(char c :mess) {
				if(charCountNew.containsKey(c)) {
					charCountNew.put(c,charCountNew.get(c)+1);
				}else {
					charCountNew.put(c,1);
				}
			}
			int no=0;
			for(Map.Entry entry:charCountOriginal.entrySet()) {
				if(charCountNew.get(entry.getKey())!=entry.getValue()) {
					no++;
					break;
				}
			}
			if(no==1) {
				out.println("NO");
			}else {
				out.println("YES");
			}
		}
	}
}
