import java.io.*;
import java.util.*;

public class youngPhysicist {
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
		int[] totalForce = {0,0,0};
		
		FastReader in = new FastReader();
        int length = Integer.parseInt(in.nextLine());
        int i = 0;
        while(i<length) {
        	String[] input = (in.nextLine()).split(" ");
            for (int p = 0; p < input.length; p++){
                totalForce[p] = totalForce[p]+Integer.parseInt(input[p]); 
            }
        	i++;
        }
        if(totalForce[0]==0 && totalForce[1]==0 && totalForce[2]==0) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
	}
	
}













