import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.io.*;

public class beautifulYear {
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
	public static boolean checkUnique(int number) {
		int[] newNumber = Integer.toString(number).chars().map(a->a-'0').toArray();
		List<Integer> list  = Arrays.stream( newNumber ).boxed().collect( Collectors.toList() );
		Set<Integer> s = new HashSet<Integer>(list);
		return (s.size()==newNumber.length);
		
	}
	
	public static void main(String[] args) {
		FastReader in = new FastReader();
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
		int initial = in.nextInt();
		int end = initial;
		boolean x=false;
		while(x==false) {
			end++;
			x=checkUnique(end);
		}
		System.out.println(end);
		
		}
}
