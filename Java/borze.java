import java.io.*;
import java.util.*;


public class borze {
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

        String[] rawScript = (in.nextLine()).split("(?!^)");

        int length = rawScript.length;
        int i = 0;
        String translate="";
        stack3 script = new stack3();
        while(i < length) {
        	String x = script.push(rawScript[i]);
        	if(x!=null) {
        		translate+=x;
        	}
        	i++;
        }
        if(script.peek()== "0") {
        	out.println(translate);
        }else {
        	out.println(translate+"0");
        }
	}
}
class stack3 {
	public dataItem2 top;
	
	public stack3(){
		this.top = null;
	}
	public String push(String value) {
		dataItem2 newValue = new dataItem2(value);
		if(this.top == null) {
			this.top = newValue;
			return null;
		}
		else {

				if((this.top.storedData+newValue.storedData).equals("-.")) {
					this.pop();
					return "1";
				}else if((this.top.storedData+newValue.storedData).equals("--")) {
					this.pop();
					return "2";
				}else {
					this.pop();
					this.push(newValue.storedData);
					return "0";
				}
		}
	}
	public void pop() {
			this.top=this.top.nextItem;
		}
	public String peek() {
		if(this.top==null) {
			return "0";
		}
		else {
			return " ";
		}
		
	}
}



class dataItem2 {
	public String storedData = " ";
	public dataItem2 nextItem = null;
	
	public dataItem2(String value) {
		this.storedData = value;
	}
}


