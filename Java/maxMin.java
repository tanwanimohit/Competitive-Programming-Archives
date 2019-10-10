import java.io.*;
import java.util.*;
import java.util.stream.*;

public class maxMin {
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
        int length = Integer.parseInt(in.nextLine());
        
		int i=0;
        
            String input = in.nextLine();
            String[] stringValues = input.split(" ");
            int[] values = new int[stringValues.length]; 
            for (int p = 0; p < stringValues.length; p++){
                values[p] = Integer.parseInt(stringValues[p]); 
            }
            int[] valuesRev= values.clone();
            for(int r=0; r<valuesRev.length/2; r++){
            	  int temp = valuesRev[r];
            	  valuesRev[r] = valuesRev[valuesRev.length -r -1];
            	  valuesRev[valuesRev.length -r -1] = temp;
            	}
            
            int[] answer = new int[length];
            int s = length-1;
            while (s>=0) {
            	stack stack2 = new stack();
            	int x1=0;
            	while(x1<s) {
            		if(valuesRev[x1]>valuesRev[s]) {

	            		if(stack2.top == null) {
	            			stack2.push(Integer.toString(length-x1));
	            		}
	            		else if(length-x1 <= Integer.parseInt(stack2.top.storedData)) {
	            			stack2.push(Integer.toString(length-x1));
	            		}
	            	}
	            	x1++;
            	}
            	if(stack2.top==null) {
	            	stack2.push("-1");
	            }
            	answer[length-s-1]=Integer.parseInt(stack2.top.storedData);
            	s--;
            }
            
            
            
            
            
            while (i<length) {
            	stack stack1 = new stack();
            	int x=0;
	            while(x<i) {
	            	
	            	   
	            	if(values[x]>values[i]) {

	            		if(stack1.top == null) {
	            			stack1.push(Integer.toString(x+1));
	            		}
	            		else if(x>= Integer.parseInt(stack1.top.storedData)-1) {
	            			stack1.push(Integer.toString(x+1));
	            		}
	            	}
	            	x++;
	            }
	            if(stack1.top==null) {
	            	stack1.push("-1");
	            }
	            answer[i]=answer[i]+Integer.parseInt(stack1.top.storedData);
	            i++;
	            
        }
            IntStream stream = Arrays.stream(answer); 
            stream.forEach(str -> System.out.print(str + " "));
	}
}

//class stack {
//	public dataItem top;
//	
//	public stack(){
//		this.top = null;
//	}
//	public void push(String value) {
//		dataItem newValue = new dataItem(value);
//		if(this.top == null) {
//			this.top = newValue;
//		}
//		else {
//			newValue.nextItem= this.top;
//			this.top=newValue;
//		}
//	}
//	public String peek() {
//		if(this.top == null) {
//			return "underflow";
//		}
//		else {
//			String front = this.top.storedData;
//			this.top=this.top.nextItem;
//			return front;
//		}
//	}
//}

//class dataItem {
//	public String storedData = null;
//	public dataItem nextItem = null;
//	
//	public dataItem(String value) {
//		this.storedData = value;
//	}
//}













