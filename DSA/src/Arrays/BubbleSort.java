package Arrays;

import java.util.ArrayList;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,4,6,9,10,26,23,78,56,45,76,982,1,4,6,2};
		int ans[] = bubbleSort(arr);
		ArrayList<Integer> sol = new ArrayList<>();
		for(int i =0;i<ans.length;i++) {
			sol.add(ans[i]);	
		}
		System.out.println(sol);
		
	}
	static void swap(int arr[], int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int[] bubbleSort(int arr[]) {
		int n =arr.length;
		for(int i =0 ; i<n;i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j+1] < arr[j]) {
					swap(arr,j+1,j);
				}
			}
		}
		return arr;
	}

}
