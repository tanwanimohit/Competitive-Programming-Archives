import java.io.*;
import java.util.*;


public class stackDriver {
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
		stack stack1 = new stack();
		FastReader in = new FastReader();
        int queries = Integer.parseInt(in.nextLine());

        while (queries > 0) {
        	
            String input = in.nextLine();
            String[] commands = input.split(" ");
            int[] commandsNew = new int[commands.length]; 
            for (int i = 0; i < commandsNew.length; i++){
                commandsNew[i] = Integer.parseInt(commands[i]); 
            }
            if(commandsNew[0]==1) {
            	System.out.println(stack1.peek());
            }else {
            	stack1.push(Integer.toString(commandsNew[1]));
            }
            queries-=1;
        }
	}
}

class stack {
	public dataItem top;
	
	public stack(){
		this.top = null;
	}
	public void push(String value) {
		dataItem newValue = new dataItem(value);
		if(this.top == null) {
			this.top = newValue;
		}
		else {
			newValue.nextItem= this.top;
			this.top=newValue;
		}
	}
	public String peek() {
		if(this.top == null) {
			return "underflow";
		}
		else {
			String front = this.top.storedData;
			this.top=this.top.nextItem;
			return front;
		}
	}
}

class dataItem {
	public String storedData = " ";
	public dataItem nextItem = null;
	
	public dataItem(String value) {
		this.storedData = value;
	}
}












