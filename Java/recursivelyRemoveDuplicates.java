import java.io.*;
import java.util.*;


public class recursivelyRemoveDuplicates {
	public static PrintWriter out;
	static class FastReader{
		BufferedReader br;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	static void stack_push(Stack letters,char x) {
		if(letters.empty()) {
			letters.push(x);
		}
		else {
			if(x==(Character)letters.peek()) {
				
				letters.pop();
			}else {
				letters.push(x);
			}
		}
	}
	
	static StringBuilder stack_traverse(Stack letters) {
		StringBuilder s = new StringBuilder();
		while(!letters.empty()) {
			s.append(letters.pop());		
		}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		FastReader in = new FastReader();
		
		int testCases = Integer.parseInt(in.nextLine());
		int t=0;
		
		while(t<testCases) {
			Stack<Character> letters = new Stack<Character>();
			String input = in.nextLine();
			
			for(int i=0;i<input.length();i++) {
				
				stack_push(letters,input.charAt(i));		
			}
			
			out.println(stack_traverse(letters).reverse());
			t++;
		}
		out.flush();
	}
}
