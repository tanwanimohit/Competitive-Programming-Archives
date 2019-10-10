import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;

public class nextPrime {
	public static PrintWriter out;
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }

	public static void main(String[] args) {
		FastReader in = new FastReader();
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		String inputstring = in.nextLine();
		String[] strValues = inputstring.split(" ");
		int[] values = Arrays.stream(strValues).mapToInt(Integer::parseInt).toArray();
		int n = values[0];
		BigInteger b = new BigInteger(String.valueOf(n));
		int nextPrime = Integer.parseInt(b.nextProbablePrime().toString());
		if(nextPrime==values[1]) {
			out.println("YES");
		}else {
			out.println("NO");
		}
	}
}


















