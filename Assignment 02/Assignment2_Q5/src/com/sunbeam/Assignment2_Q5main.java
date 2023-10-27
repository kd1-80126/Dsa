package com.sunbeam;

public class Assignment2_Q5main {
	public static void BubbleSort( Employee[] arr, int N) {
		int count = 0;
		int passes = 0;
		int flag;
		
		for(int i = 1 ; i < N ; i++) {
			passes++;
			flag = 0;
			
			for(int j = 0 ; j < N - i ; j++) {
				count++;
				if(arr[j].getSalary() > arr[j + 1].getSalary()) {
					double temp = arr[j].getSalary();
					arr[j].setSalary( arr[j + 1].getSalary()); 
					arr[j + 1].setSalary(temp);
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		System.out.println("No of comparisions : " + count);
		System.out.println("No of passes : " + passes);
	}
	public static void main(String[] args) {

		Employee[] arr = new Employee[3];
		arr[0]=new Employee("Akshay",1,2000);
		arr[1]=new Employee("Saurabh",2,8000);
		arr[2]=new Employee("Manoj",3,5000);
		
		BubbleSort(arr,arr.length);
		System.out.println("after sorting ");
		
		for(Employee e:arr)
		{
			System.out.println(e);
		}
		
		
		
	}

}
