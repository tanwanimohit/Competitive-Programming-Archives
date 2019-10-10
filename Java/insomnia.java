import java.util.*;
import java.io.*;
import java.util.stream.*;

public class insomnia {
	public static PrintWriter out;
	static class FastReader{
		BufferedReader br;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine(){
			String str ="";
			try
			{
				str=br.readLine();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args) {
		FastReader in = new FastReader();
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		
		int k = Integer.parseInt(in.nextLine());
		int l = Integer.parseInt(in.nextLine());
		int m = Integer.parseInt(in.nextLine());
		int n = Integer.parseInt(in.nextLine());
		List<Integer> attacks = new ArrayList<>();
		attacks.add(k);
		attacks.add(l);
		attacks.add(m);
		attacks.add(n);
		int d = Integer.parseInt(in.nextLine());
		
		int[] array = IntStream.range(1, d + 1).toArray();
		

		for(int x:attacks) {
		for(int i =0; i<array.length;i++) {
			if(array[i]!=0) {
				if(array[i]%x==0) {
					array[i]=0;
				}
			}
		}
		}
		int deaths =0;
		for(int x:array) {
			if(x==0) {
				deaths++;
			}
		}
		out.println(deaths);
	}
	
}
