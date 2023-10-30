package com.sunbeam;

import com.sunbeam.List.Node;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node tail;

	public List() {
		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;

	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {

			tail = newnode;
			tail.next = tail;
		} else {

			Node trav = tail.next;
			tail.next = newnode;
			newnode.next = trav;

		}
	}

	public void addLast(int value) {

		Node newnode = new Node(value);
		if (isEmpty()) {

			tail = newnode;
			tail.next = tail;
		}

		else {
			newnode.next = tail.next;
			tail.next = newnode;

			

			tail = newnode;

		}
	}

	
	public void DelFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			
		}
		
		else
		{ Node trav;
	       trav = tail.next ;		
	       trav=trav.next;
	       tail.next = trav;
		}
	}
//	
//	public void DelLast()
//	{
//		if (isEmpty())
//		{
//			System.out.println("List is empty");
//			
//		}
//		else if(head.next==null)
//		{
//			head = null;
//			tail= null; 
//		}
//		else
//		{
//			Node trav = head;
//			while(trav.next.next!=null)
//			{
//				trav = trav.next;
//				
//			}
//			tail = trav;
//			tail.next = null;
//		}
//	}
//	
	public void Display() {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			Node trav = tail.next;
			System.out.print(" List:");

			do {
				System.out.print(" " + trav.data);
				trav = trav.next;

			} while (trav != tail.next);
			System.out.println(" ");
		}
	}

}
