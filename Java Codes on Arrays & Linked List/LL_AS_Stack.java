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
			System.out.println();
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
	
	public int deleteFirst()
	{
		Node temp;
		if(start == null)
		{
			System.out.println("List is already empty");
			return 0;
		}
			
		else
		{
			temp=start;
			start=start.getNext();
			size--;
			return temp.getData(); 
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
	
	public int GetFirst()
	{
		if(size==0)
		{
			System.out.println("LL is empty");
			return 0;
		}
		else
		{
			return start.getData();
		}
	}
	
	public int getLast()
	{
		Node temp;
		
		if(size==0)
		{
			System.out.println("LL is empty");
			return 0;
		}
		else
		{
			temp = start;
			while( temp.getNext() != null )
			{
				temp = temp.getNext();
			}
			return temp.getData();
		}
	}
}

class LL_as_Stack
{
	private LinkedList stack;
	
	public LL_as_Stack()
	{
		this.stack = new LinkedList();
	}
	
	public int size()
	{
		return this.stack.getListSize();
	}
	
	public boolean isEmpty()
	{
		return this.stack.isEmpty();
	}
	
	public void push(int data)
	{
		this.stack.insertAtFirst(data);
	}
	
	public int pop() throws Exception 
	{
		return this.stack.deleteFirst();
	}
	
	public int top() throws Exception
	{
		return this.stack.GetFirst();
	}

    /* public int last() throws Exception
	{
		return this.stack.getLast();
	} */	
	
	public void display()
	{
		this.stack.viewList();
	}
}

public class LL_Stack
{
	public static void main(String[] args) throws Exception
	{
		LL_as_Stack stack = new LL_as_Stack();
		
		stack.push(10);
		stack.display();
	}
}