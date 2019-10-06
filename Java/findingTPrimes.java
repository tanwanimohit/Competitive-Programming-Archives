import java.io.*;
import java.util.*;

public class findingTPrimes {
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
	
	static int[] sieve() {
		int n =1000000;
		int[] primes= new int[n];
		Arrays.fill(primes, 1);
		primes[0]=primes[1]=0;
		for(int i =2;i<n;i++) {
			if(primes[i]==1) {
				for(int j =2;i*j<n;i++) {
					primes[i*j]=0;
				}
			}
		}
		return primes;
	}
	
	static double sqroot(long x) {
		double l=0;
		double r=x;
		for(int iters=0;iters<100;iters++) {
			double mid =(l+r+1)/2;
			if(mid*mid<=x) {
				l=mid;
			}else {
				r=mid-1;
			}
		}
		
		
		return l;
	}

	
	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		FastReader in = new FastReader();
		int[] primes = sieve();
		int length = Integer.parseInt(in.nextLine());
		long[] data1 = Arrays.stream(in.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
		int t=0;
		while(t<length) {
			long currentNumber=data1[t];
	out.println(sqroot(currentNumber));

			
			if (currentNumber == 4) {
		        out.println("YES");
		        }
			else if(currentNumber < 4 || currentNumber%2==0) {
				out.println("NO");
			}
			else if(sqroot(currentNumber)==(int)sqroot(currentNumber)) {
				if(primes[(int)sqroot(currentNumber)]==1) {
					out.println("YES");
				}
			}
			else {
				out.println("NO");
			}
			
			t++;
		}
		out.flush();
	}
}
