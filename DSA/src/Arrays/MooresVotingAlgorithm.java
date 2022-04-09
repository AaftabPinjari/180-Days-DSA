package Arrays;

public class MooresVotingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,2,2,2,1};
		int ans = winner(array);
		System.out.println(ans);
		

	}
	static int winner(int arr[]) {
		int ansIndex = 0;
		int count = 1;
		int freq = 0;
		for(int i = 1; i < arr.length;i++) {
			if(arr[i]==arr[ansIndex]) {
				count++;
			}
			else {
				count--;
			}
			if(count == 0) {
				ansIndex = i;
				count = 1;
			}
		}
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == arr[ansIndex]) {
				freq++;
			}
		}
		if(freq>(arr.length/2)) {
			return arr[ansIndex];			
		}else {
			return -1; 
		}
	}

}
