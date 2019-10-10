import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;
import java.lang.*;

public class fastMath {
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
		String inputstring1 = in.nextLine();
		String[] strValues1 = inputstring1.split("");
		int[] intValues1 = Arrays.stream(strValues1).mapToInt(Integer::parseInt).toArray();
		
		String inputstring2 = in.nextLine();
		String[] strValues2 = inputstring2.split("");
		int[] intValues2 = Arrays.stream(strValues2).mapToInt(Integer::parseInt).toArray();
		int[] req= new int[intValues1.length];
		
		for(int i=0;i<intValues1.length;i++) {
			req[i]=intValues1[i]^intValues2[i];
		}
		StringBuilder answer= new StringBuilder();
		answer.append("");
		Arrays.stream(req).forEach(answer::append);
		out.println(answer);
	}
}


















