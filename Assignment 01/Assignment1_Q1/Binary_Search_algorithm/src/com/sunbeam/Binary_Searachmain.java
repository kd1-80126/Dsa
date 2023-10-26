package com.sunbeam;

import java.util.Scanner;

public class Binary_Searachmain {

	public static int BinarySearch(int arr[],int size,int key)
	{
		int left = 0,right= size-1,mid,count=0;
		while(left<=right)
		{  count++;
			mid = (left +right)/2;
			
			if(key == arr[mid])
					{
				System.out.println("no of comparisions"+count);
				return mid;
					}
			else
				{
				if (key<arr[mid]) 
			{ 
			   right = mid-1;	
			}
			else
			{
				left = mid+1;
			}
			}
		}
		return -1;

	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[9];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key");
	     int key =sc.nextInt();
		int index=BinarySearch(arr,arr.length,key);
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
	}

}
