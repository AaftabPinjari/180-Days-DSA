package Arrays;

public class KadanesMaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {-1,-2,-3,-4,5};
		int ans = maxSumSubArray(array);
		System.out.println(ans);

	}
	static int maxSumSubArray(int arr[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length ; i++) {
			currSum = currSum + arr[i];
			if(currSum>maxSum) {
				maxSum = currSum;
			}
			if(currSum<0) {
				currSum = 0;
			}
		}
		return maxSum;
	}

}
