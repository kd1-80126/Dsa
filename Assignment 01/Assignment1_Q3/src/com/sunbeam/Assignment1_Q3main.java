package com.sunbeam;

import java.util.Scanner;


public class Assignment1_Q3main {

	public static int BinarySearch(int[] arr,int size,int key)
	{
	   int left=0,right= size-1,mid;
	    while(left<=right)
	    {
	    	 mid=(left+right)/2;
	    	   if(key == arr[mid])
	    	   {
	    		   return mid;
	    	   }
	    	   else 
	    	   {
	    		   if(key<arr[mid])
	    		   {
	    	   
	    		    left = mid+1;
	    	       }
	    	      else
	    	      {
	    	    	  right= mid-1;
	    	      }
	    	   }
	    }	    	   
	    return -1;

	    
	}	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     int[] arr= { 10,9,8,7,6,5,4,3,2,1 };
     System.out.println("enter key to search");
     int key=sc.nextInt();
     
     int index = BinarySearch(arr,arr.length,key);
     if(index!= -1)
     {
     System.out.println("key is found at index"+index);
     }
     else
     {
         System.out.println("key not found");

     }
	}

}
