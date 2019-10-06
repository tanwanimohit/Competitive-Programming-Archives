import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.*;

public class drinks {
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
		int glasses = Integer.parseInt(in.nextLine());
		double totalFraction = 0.0;
		double[] fractions= Arrays.stream(in.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		for(int i=0; i<fractions.length;i++) {
			fractions[i]/=100;
		}
		for(double x:fractions) {
			totalFraction+=x;
		}
		
		double answer = totalFraction/glasses;
		out.println(answer*100);
		}
}
