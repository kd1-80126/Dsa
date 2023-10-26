package com.sunbeam;

import java.util.Scanner;

public class Assignment1_Q4main {

	public static int LinearSearch(int[] arr,int key,int n)
	{ int count=0;
	   for(int i = 0;i<arr.length;i++)
	   {
		   if(key == arr[i])
		   {
			   count++;
		      if(count == n)
               
               return i;
	
              }
		   }
	   return -1;
	   }
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 2, 4, 2, 5, 6, 2, 8, 2 };
		System.out.println("enter key to search");
		int key = sc.nextInt();
		System.out.println("Enter no of occurence");
		int n = sc.nextInt();

		int index = LinearSearch(arr, key, n);
		 if (index != -1) {
	            System.out.println("The " + n + "th occurrence of " + key + " is at index " + index);
	        } else {
	            System.out.println("The " + n + "th occurrence of " + key + " was not found.");
	        }
	}

}







/*public class LinearSearchNthOccurrence {

    public static int findNthOccurrence(int[] arr, int target, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == n) {
                    return i; // Found the nth occurrence
                }
            }
        }
        return -1; // Nth occurrence not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 4, 8, 4, 10, 4, 12};
        int target = 4;
        int n = 3;

        int index = findNthOccurrence(arr, target, n);
        if (index != -1) {
            System.out.println("The " + n + "th occurrence of " + target + " is at index " + index);
        } else {
            System.out.println("The " + n + "th occurrence of " + target + " was not found.");
        }
    }
}
*/
