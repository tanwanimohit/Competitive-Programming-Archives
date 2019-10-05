/* Program to find Max sum that cab be formed from array elements
    while scanning elements contiguosly  */
public class MaxSubArray {
	
	private void bruteForce(int arr[]) {
		int currentArraySum;
		int maxSubArraySum=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			currentArraySum = arr[i];
			for(int j=i+1; j<=arr.length;j++) {
				if(j==arr.length)
					break;
				if(currentArraySum>maxSubArraySum) {
					maxSubArraySum = currentArraySum;
				}
				currentArraySum += arr[j];
			}
		}
		System.out.println(maxSubArraySum); 
	}
	
	public static void main(String[] args) {

        // Example Array
		int[] arr = new int[]{3,-2,1,4,-1};
		
		MaxSubArray subArray = new MaxSubArray();
		subArray.bruteForce(arr);
        // Output : 6 -> from the sub array {3,-2,1,4}
	}

}
