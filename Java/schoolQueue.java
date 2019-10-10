import java.io.*;
import java.util.*;
//import java.util.stream.*;

public class schoolQueue {
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
        String[] queries = (in.nextLine()).split(" ");
        int[] queries1 = new int[queries.length]; 
        String changed="";
        for (int i = 0; i < queries.length; i++){
            queries1[i] = Integer.parseInt(queries[i]); 
        }
        String[] input = (in.nextLine()).split("(?!^)");

        int iterations = queries1[1];

        while ( iterations > 0) {
        	stack1 line = new stack1();
            int length=queries1[0];
            while(length>0) {
            	line.push(line,input[length-1],0);
            	length--;
            }
            changed =line.traverse();
            input = changed.split("(?!^)");
            iterations--;
        }
        out.println(changed);
	}
}
class stack1 {
	public dataItem1 top;
	
	public stack1(){
		this.top = null;
	}
	public void push(stack1 queue,String value,int check) {
		dataItem1 newValue = new dataItem1(value);
		if(this.top == null) {
			this.top = newValue;
		}
		else {
			
			if(check == 0 && this.top.storedData.equals("G")&& newValue.storedData.equals("B")&&this.top.switched==false&&newValue.switched==false) {
				queue.pop();
				queue.push(queue,"B",1);
				
				queue.push(queue,"G",1);

				this.top.switched=true;
				this.top.nextItem.switched=true;
				
			}else { 
				newValue.nextItem= this.top;
				this.top=newValue;
			}
		}
	}
	public String peek() {
		if(this.top == null) {
			return "underflow";
		}
		else {
			String front = this.top.storedData;
			return front;
		}
	}
	public void pop() {
			this.top=this.top.nextItem;
		}
	public String traverse() {
		String last=""; 
		dataItem1 currNode = this.top;
		while(currNode!=null) {
			last+=currNode.storedData;
			currNode= currNode.nextItem;
		}
		return last;
	}
}



class dataItem1 {
	public String storedData = " ";
	public dataItem1 nextItem = null;
	public boolean switched = false;
	
	public dataItem1(String value) {
		this.storedData = value;
	}
}


