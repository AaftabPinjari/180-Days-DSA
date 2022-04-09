package BitMagic;

public class MissingNumber {
	
	static int MissingNum(int arr[],int n) {
		int a = arr[0];
		int b = 0;
		//theory
		//A ^ 0 = A
		//A ^ A = 0
		//XOR all the nums in the array
		for(int i = 1; i < n-1; i++) {
			a = a ^ arr[i];
		}
		//XOR all the nums from 1 to n
		for(int i = 1; i <= n; i++) {
			b = b^i;
		}
		//XOR the two values to get the missing number
		return a ^ b;
	}
	public static void main(String[] args) {
		int arr[] = {3,2,5,1,4,8,9,7,10};
		int n = 10;
		int ans = MissingNum(arr,n);
		System.out.println(ans);
	}
}
