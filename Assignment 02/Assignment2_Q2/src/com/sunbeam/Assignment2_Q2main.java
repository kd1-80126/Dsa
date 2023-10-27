package com.sunbeam;

import java.util.Arrays;

public class Assignment2_Q2main {

public static int BubbleSort(int[]arr,int length)
{
	int cnt=0,passes=0,flag;
	for(int i = 1;i<length;i++)
	{    passes++;
	flag= 0;
		for(int j=0;j<length-i;j++)
		{cnt++;//true howo n howo total no of comparisions ikdach yenar
			if(arr[j]>arr[j+1])
			{	

				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag= 1;
			}
		}
		if(flag == 0)
			break;
	}
	System.out.println("No of comparisions is"+cnt);
	System.out.println("No of comparisions is"+passes);

	
	
return -1;	
}
	
	

	
	 public static void main(String[] args) 
	{
int[] arr= {11,22,33,44,55,66};

System.out.println("array before sort"+Arrays.toString(arr));

BubbleSort(arr,arr.length);

System.out.println("array after sort"+Arrays.toString(arr));






}

}
