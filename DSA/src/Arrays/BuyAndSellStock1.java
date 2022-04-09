package Arrays;

public class BuyAndSellStock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {7,1,5,3,6,4};
		int ans = buyAndSell(array);
		System.out.println(ans);

	}
	static int buyAndSell(int arr[]) {
		int profit = 0;
		int maxProfit = 0;
		int minSoFar = arr[0];
		for (int i=0;i<arr.length;i++) {
			minSoFar= Math.min(minSoFar, arr[i]);
			profit = arr[i] - minSoFar;
			maxProfit  = Math.max(profit, maxProfit);
		}
		return maxProfit;
	}
}
