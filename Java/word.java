import java.util.*;
import java.util.stream.Collectors;


import java.io.*;

public class word {
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
		String input = in.nextLine();
		String[] strinput = new String[input.length()];
		for(int i=0; i<input.length();i++) {
			strinput[i]=Character.toString(input.charAt(i));
		}
		
		int flag= -1;
		int four=0;
		int seven=0;
		for(int i=0;i<strinput.length;i++) {
			if(strinput[i].equals("4") ){
				four++;
			}
			else if(strinput[i].equals("7")){
				seven++;
			}
			else {
				out.println("NO");
				flag=0;
				break;
			}
		}
		if(flag==-1 && four>=1 && seven>=1) {
			out.println("YES");
		}else if(flag!=0){
			out.println("NO");
		}
	}
	
}














