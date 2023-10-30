package com.sunbeam;

import com.sunbeam.List.Node;

public class Assignment04_Q4main {

	public static void main(String[] args) {
		
		List l1 = new List();
		
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		l1.addFirst(60);
		l1.Display();
		
		l1.ReverseList();
		l1.Display();

	}

}
