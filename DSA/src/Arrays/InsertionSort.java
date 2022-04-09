package Arrays;

import java.util.ArrayList;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,4,6,9,10,26,23,78,56,45,76,982,1,4,6,2};
		int ans[] = insertionSort(arr);
		ArrayList<Integer> sol = new ArrayList<>();
		for(int i =0;i<ans.length;i++) {
			sol.add(ans[i]);	
		}
		System.out.println(sol);
	}
	static int[] insertionSort(int arr[]) {
		int n = arr.length;
		for(int i =1;i<n;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && temp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return arr;
	}

}
