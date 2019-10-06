import java.io.*;
import java.util.*;
import java.util.stream.*;

public class horseShoe {
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
		List<Integer> shoes = new ArrayList<>();
		int[] temp = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		shoes = Arrays.stream(temp).boxed().collect(Collectors.toList());
		Set<Integer> s = new HashSet<Integer>(shoes);
		out.println(temp.length-s.size());
	}
}
