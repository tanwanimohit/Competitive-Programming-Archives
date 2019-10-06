import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;
import java.lang.*;

public class swapGame {
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
		int noOfSoldiers = Integer.parseInt(in.nextLine());
		int[] heightsOriginal = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int tallest = heightsOriginal[0];
		int smallest = heightsOriginal[heightsOriginal.length-1];
		Arrays.sort(heightsOriginal);
		out.println(Arrays.toString(heightsOriginal));
		int ignoreTall =0;
		int ignoreSmall =0;
		if(smallest == heightsOriginal[0]) {
			ignoreSmall++;
		}
		if(tallest ==heightsOriginal[heightsOriginal.length-1]) {
			ignoreTall++;
		}
		int currTall=0;
		int currSmall=heightsOriginal[heightsOriginal.length-1];
		int temp = 0;
		while(true) {
			
		}
		
		
	}
}


















