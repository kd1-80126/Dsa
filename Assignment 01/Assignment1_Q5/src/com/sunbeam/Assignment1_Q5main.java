package com.sunbeam;

import java.util.Scanner;

public class Assignment1_Q5main {

	public static int LinearSearch(int arr[], int size) {
		
		for (int i = 0; i < size; i++) 
		{int count = 0;
			for (int j = i + 1; j < size; j++) 
			{
				if (arr[i] == arr[j]) 
				{
					count++;
					break;
				}
				
				}
			if (count == 0) {
				System.out.println("Not repeated" + arr[i]);
			}

		}
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		Scanner sc = new Scanner(System.in);

		int index = LinearSearch(arr, arr.length);
	}

}
