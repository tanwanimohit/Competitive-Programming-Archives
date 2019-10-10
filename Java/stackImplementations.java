import java.util.*;

import java.io.*;

public class stackImplementations {
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

	static boolean checkIfBalancedBrackets(String input) {
		Stack<Character> s1 =new Stack<Character>();
		int i =0;
		while(i<input.length()) {
			if(input.charAt(i)=='(' || input.charAt(i)=='{' || input.charAt(i)=='[') {
				s1.push(input.charAt(i));	
			}
			else {
				StringBuilder S = new StringBuilder();
				S.append(s1.peek());
				S.append(input.charAt(i));
				String str = S.toString();
				if(!s1.isEmpty()) {
					if(str.equals("()")||str.equals("[]")||str.equals("{}")) {
						s1.pop();
					}
				}
			}
			
			i++;
		}
		
		
	
		
		
		
		
		
		
		
		
		
		return s1.isEmpty();
	}
	
	static long[] nextGreatestNumber(long[] input) {
		
		int n = input.length;

		Stack<Long> s1 = new Stack<Long>();
		long [] ans = new long[n];
		
		for(int i=n-1;i>=0;i--) {
			while((!s1.empty()) && input[i]>=s1.peek()) {
				s1.pop();
			}
			ans[i] = s1.empty()?-1:s1.peek();
			s1.push(input[i]);
		}
		
		
		return ans;
	}
		
	
	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		FastReader in = new FastReader();
		
		int testCases = Integer.parseInt(in.nextLine());
		int t=0;
		
		while(t<testCases) {
//			String n = in.nextLine();
//			if(checkIfBalancedBrackets(n)) {
//				out.println("balanced");
//			}else {
//				out.println("not balanced");
//			}
			
			
			
			int size = Integer.parseInt(in.nextLine());
			long[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
			long[] result = nextGreatestNumber(data1); 
			Arrays.stream(result).forEach(nb-> out.print(nb+" "));
			out.println();
			t++;
		}
		out.flush();
	}
}
