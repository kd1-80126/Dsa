package com.sunbeam;

public class Assignment04_03main {

	public static void main(String[] args) {

		List l1 = new List();

		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(120);
		l1.addFirst(40);
		l1.addFirst(50);
		l1.addFirst(60);
		l1.addFirst(70);
		l1.addFirst(80);
         
		l1.Display();
		int mid = l1.FindMid();
		System.out.println("mid is"+mid);
		
	}

}
