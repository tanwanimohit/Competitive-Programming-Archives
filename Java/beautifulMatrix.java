import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class beautifulMatrix {
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
	public static int find(int[] a, int target)
	{
		return IntStream.range(0, a.length)
						.filter(i -> target == a[i])
						.findFirst()
						.orElse(-1);	// return -1 if target is not found
	}
	public static void main(String[] args) {
		FastReader in = new FastReader();
		out = new PrintWriter(new BufferedOutputStream(System.out),true);
        int length = 5;
        int i =0;
        int c=0;
        int[] intInput = new int[5];
        int d=-1;
        while(i<length) {
        	String[] input = (in.nextLine()).split(" ");
        	for(int p =0;p<input.length;p++) {
        		intInput[p]=Integer.parseInt(input[p]);
        	};
        	d=find(intInput,1);
        	if(d>=0) {
        		break;
        	}
        	c++;
        	i++;
        }
        d++;
        c++;
        out.println(Math.abs(3-c)+Math.abs(3-d));
	}
}
