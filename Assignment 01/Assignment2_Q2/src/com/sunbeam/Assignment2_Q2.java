package com.sunbeam;

import java.util.Scanner;

public class Assignment2_Q2 {


public static int LinearSearch(Employee[] arr,int size,double key)
{
	for(int i =0;i<size;i++)
	{
		if(arr[i].getSalary() == key)
		{
			return i;
		}
	}
	return -1;
}
	
	
//	public static int LinearSearch(Employee[] arr,int size,String key)
//	{
//		for(int i = 0;i<size;i++)
//		{
//			if(arr[i].getName().equals(key))
//			{
//				return i;
//			}
//		}return -1;
//	}
	
//	public static int LinearSearch(Employee[] arr,int size,int key)
//	{
//		for(int i=0; i<size;i++)
//		{
//			if(arr[i].getEmpid() == key)
//			{
//				return i;
//			}
//			
//		}
//		return -1;
//	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee[] arr= new Employee[3];
		System.out.println("Enter Employee details:");
		for(int i= 0;i<arr.length;i++)
		{
			arr[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		}
		
		System.out.println("Enter key");
		//int key=sc.nextInt();
		//String key=sc.next();
		double key=sc.nextDouble();
		int index= LinearSearch(arr,arr.length,key);
		if(index!= -1)
		{
			System.out.println("key found at index"+index);
		}
		else
		{
			System.out.println("key not found");
		}
	}

}
