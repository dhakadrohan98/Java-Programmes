import java.util.*;
import java.io.*;

class Node
{
	private int data;
	private Node next;
	
	public Node()  //default constructor
	{
		data=0;
		next=null;
	}
	
	public Node(int d,Node n) //constructor
	{
		data=d;
		next=n;
	}
	
	public void setData(int d)
	{
		data=d;
	}
	
	public void setNext(Node n)
	{
		next=n;
	}
	
	public int getData()
	{
		return data;
	}
	
	public Node getNext()
	{
		return next;
	}
}

class LinkedList
{
	private Node start;
	private int size;
	
	public LinkedList()
	{
		size=0;
		start=null;
	}
	
	public boolean isEmpty()
	{
		if( start==null)
			return (true);
		else
			return (false);
	}
	
	public int getListSize()
	{
		return size;
	}
	
	public void viewList()
	{
		Node t;
		
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			t = start;
			for( int i=1; i<=size; i++)
			{
				System.out.println(" "+ t.getData());
				t = t.getNext();
			}
		}
	}
	
	public void insertAtFirst(int val)
	{
		Node n;
		n = new Node();
		n.setData(val);
		n.setNext(start);
		start=n;
		size++;
	}
	
	public void insertAtLast(int val)
	{
		Node n,t;
		n=new Node();
		n.setData(val);
		t=start;
		
		if(t==null)
			start=n;
		
		else
		{
			while(t.getNext() != null)
			{
				t = t.getNext();
			}
			t.setNext(n);
		}
		size++;
	}
	
	//Insertion of node at a given position
	public void insertAtPos(int val, int pos)
	{
		if(pos==1)
			insertAtFirst(val);
		
		else if (pos==size+1)
		{
			insertAtLast(val);
		}
		
		else if (pos>1 && pos<=size)
		{
			Node n,t;
			n = new Node(val,null);
			t=start; //Temporary Node
			
			for(int i=1; i<(pos-1); i++)
			{
				t=t.getNext();
			}

            n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
	}
	
	//deletion operations
	
	public void deleteFirst()
	{
		if(start == null)
			System.out.println("List is already empty");
		else
		{
			start=start.getNext();
			size--;
		}
	}
	
	public void deleteLast()
	{
	 if(start==null)
     {
		System.out.println("List is already empty"); 
	 }

	 else if(size==1)
	 {
		 start=null;
		 size--;
	 }
	 
	 else
	  {
		 Node t;
		 t = start;
		 
		 for(int i=1; i<size-1; i++)
			 t = t.getNext();
		 
		 t.setNext(null);
		 size--;
	  }
	
	}
	
	public void deleteAtPos(int pos)
	{
		if(start==null)
			System.out.println("List is already empty");
		
		else if(pos<1 || pos>size)
			System.out.println("Invalid position");
		
		else if(pos==1)
			deleteFirst();
		
		else if( pos==size)
			deleteLast();
		
		else
		{
			Node t,t1;
			t= start;
			
			for(int i=1; i<pos-1; i++)
				t = t.getNext();
			
			t1 = t.getNext();
			
			t.setNext(t1.getNext());
			size--;
		}
	}
}

public class LL_AS_Queue
{
	private LinkedList queue;
	
	public LL_AS_Queue()
	{
		this.queue = new LinkedList();
	}
	
	public int size()
	{
		return this.queue.getListSize();
	}
	
	public boolean isEmpty()
	{
		return this.queue.isEmpty();
	}
	
	public void enqueue(int data)
	{
		this.queue.insertAtLast(data);
	}
	
	public int dequeue() throws Exception 
	{
		return this.queue.deleteFirst();
	}
	
	/* public int front() throws Exception
	{
		return this.queue.getFirst();
	} */
	
	public void display()
	{
		this.queue.viewList();
	}
}

public class LL_as_Queue
{
	public static void main(String[] args)
	{
		LL_AS_Queue queue = new LL_AS_Queue();
		queue.enqueue(10);
		queue.display();
	}
}