package com.sunbeam;

import java.util.Arrays;

public class Assignment2_Q3main {

	public static void insertionSort(int[] arr,int N)
	{int count=0;
	for(int i=1; i<N;i++)
	{
		int temp = arr[i];
		int j = i-1;
		while(i>=0 )
		{	
			count++;
			if(arr[j]>temp)
		{ 
			arr[j+1]=arr[j];
			j--;
		}
			else
				break;
		}
		arr[j+1]=temp;
	}
	System.out.println("no of comparisons"+count);
	}
	
	
	
	
	public static void main(String[] args) {
int arr[] = {44,86,79,53,47,88,77,99,82,100};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
