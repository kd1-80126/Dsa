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

	private Node head;
	private Node tail;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;

	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
		    tail = newnode;
		}
		else {

			newnode.next=head;

			head = newnode;
			
		}
	}

	public void addLast(int value) {
		
		Node newnode = new Node(value);
				if(isEmpty())
		
			head = newnode;
		
		else {
		
			tail.next=newnode;
			newnode.next= null;
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
		{
	       head = head.next;		
		}
	}
	
	public void DelLast()
	{
		if (isEmpty())
		{
			System.out.println("List is empty");
			
		}
		else if(head.next==null)
		{
			head = null;
			tail= null; 
		}
		else
		{
			Node trav = head;
			while(trav.next.next!=null)
			{
				trav = trav.next;
				
			}
			tail = trav;
			tail.next = null;
		}
	}
	
	public void Display()
	{
		Node trav= head ;
		System.out.print(" List:");
		
		while(trav!=null)
		{
			System.out.print(" "+trav.data);
			trav=trav.next;
			
		}
		System.out.println(" ");
	}
	
   public	void ReverseList()
   {
	   Node t1 = head;
	   Node t2 = head.next;
	   
	   head.next = null;
	   while(head!=null)
	   {
		   head=t2.next;
		   t2.next = t1;
		   t1 = t2;
		   t2 = head;
		   
	   }
	   head = t1;
   }
	
	
	
	
	
	
	
	
}
