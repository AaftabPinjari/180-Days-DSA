package Arrays;

public class BuyAndSellStock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {7,1,5,3,6,4};
		int ans = buyAndSell2(array);
		System.out.println(ans);
	}
	static int buyAndSell2(int arr[]) {
		int profit = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				profit += arr[i] -arr[i-1];
			}
		}
		return profit;
	}

}
