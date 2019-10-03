public class Gcd {
    public static void main(String[] args) {
       int a,b,r;
       a = Integer.parseInt((args[0]));
       b = Integer.parseInt((args[1]));
       
       while(b!= 0){
    	   r = a % b;
    	   a=b;
    	   b=r;
       }
       System.out.println("Your greatest common divisor is: " +a);
    }
}
