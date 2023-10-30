package com.sunbeam;

public class SinglyLinearLinkedListmain {

	public static void main(String[] args) {
		List l1 = new List();
		
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addLast(30);
		l1.addLast(40);
		l1.Display();
		l1.DelFirst();
		l1.Display();
	     l1.DelLast();
	     l1.addLast(80);
	     l1.Display();
	     l1.addLast(88);
	     l1.Display();
	     l1.DelLast();
	     l1.Display();


	}

}
