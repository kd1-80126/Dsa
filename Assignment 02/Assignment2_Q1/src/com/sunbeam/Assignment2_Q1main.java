package com.sunbeam;


	




import java.util.Arrays;

public class Assignment2_Q1main {
	public static void insertionSort(int arr[], int N) {
		
		for(int i = 1 ; i < N ; i++) {
		
			int temp = arr[i];
					int j = i - 1;
					while(j >= 0 && arr[j] > temp) {
		
				arr[j + 1] = arr[j];
				j--;
			}



			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {10, 100, 90, 40, 25, 85};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}