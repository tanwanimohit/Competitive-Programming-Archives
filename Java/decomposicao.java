

public class mmc {
	
	public static void main(String[] args) {
		
		calculoDecomposicao(60);
		
	}
	
	private static void calculoDecomposicao(int num) {
		
		int divisor = 2;
		
		System.out.println("Decomposição em fatores primos: ");
		
		while(num != 1 && num > 0) {
			
			if(divisor/divisor == 1 && divisor/1 == divisor) {
				
				if ((num % divisor) == 0) {
					
					num /= divisor;
					
					System.out.println(divisor);
					
					
				} else {
					
					divisor++;
					
				}
				
			}
			
					
		}
		
		
		
	}
}
