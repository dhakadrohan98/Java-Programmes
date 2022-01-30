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
	
	public int getAt(int idx)
	{
		if(size==0)
		{
			System.out.println("\nLL is empty");
		}
		
		if(idx < 0 || idx>= size)
		{
			System.out.println("\n Invalid Index");
		}
		
		Node temp;
		temp = start;
		for(int i=1; i <= idx; i++)
			temp = temp.getNext();
		
		//System.out.println("\n" + temp.getData());
		return temp.getData();
	}
	
	public Node getNodeAt(int idx)
	{
		if(size==0)
		{
			System.out.println("\nLL is empty");
		}
		
		if(idx < 0 || idx>= size)
		{
			System.out.println("\n Invalid Index");
		}
		
		Node temp;
		temp = start;
		for(int i=1; i <= idx; i++)
			temp = temp.getNext();
		
		//System.out.println("\n" + temp.getData());
		return temp;
	}
	
	// reverseData Method Code:
	public void reverseData() throws Exception
   {
	   int left = 0;
	   int right = size-1;
	   Node t;
	   
	   while( left < right)
	   {
		   Node ln = getNodeAt(left);
		   Node rn = getNodeAt(right);
		   
		   int temp = ln.getData();
		   ln.setData(rn.getData());
		   rn.setData(temp);
		   
		   left++;
		   right--;
		   
		}
		//pritn reverse linked list
		   t = start;
		   for( int i=1; i<=size; i++)
		   {
				System.out.println(" "+ t.getData());
				t = t.getNext();
		   }   
   }
   
   // reverseData Method Code:
   public void static reversePointers()
   {
	   Node prev = start;
	   Node curr = null;
	   Node tail = getNodeAt(size);
	   curr.setNext(prev.getNext());
	   
	   while(curr != null)
	   {
		   Node ahead = curr.getNext();
		   curr.setNext(prev);
		   
		   prev = curr;
		   curr = ahead;
	   }
	   
	   //swap
	   Node t = start;
	   start = tail;
	   tail = t;
	   
	   tail.setNext(null);
	   
	   //pritn reverse linked list
		   Node t1 = start;
		   for( int i=1; i<=size; i++)
		   {
				System.out.println(" "+ t1.getData());
				t1 = t1.getNext();
		   } 
   }
   
   // Main Method
   public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean flag = true;
		int position, val;
		
		while(flag)
		{
			System.out.println(" ");
			System.out.println("1. Add item to the list at the start");
			System.out.println("2. Add item to the list at the end");
			System.out.println("3. Add item to the list at the given position");
			System.out.println("4. Delete first item from the list");
			System.out.println("5. Delete last item from the list");
			System.out.println("6. Delete item from the list at given position");
			System.out.println("7. view list");
			System.out.println("8. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				       System.out.println("Enter value of list item");
					   val = sc.nextInt();
					   list.insertAtFirst(val);
					   break;
					   
			    case 2:
				       System.out.println("Enter value of list item");
					   val = sc.nextInt();
					   list.insertAtLast(val);
					   break;
					   
				case 3:
				       System.out.println("Enter position: ");
					   position = sc.nextInt();
					   System.out.println("Enter value of list item");
					   val = sc.nextInt();
					   list.insertAtPos(val, position);
					   break;
					   
				case 4:
				       list.deleteFirst();
					   break;
					   
				case 5:
				       list.deleteLast();
					   break;
					   
				case 6:
				       System.out.println("Enter position: ");
					   position = sc.nextInt();
					   list.deleteAtPos(position);
					   break;
					   
				case 7:
				       list.viewList();
					   break;
					   
				case 8:
				       flag = false;
					   break;
					   
				default:
				       System.out.println("Invalid choice");
				
		    }
			
		}
		//list.getAt(2); // Calling getAt method
		/* System.out.println(list.getAt(2));
		
		// Calling getNodeAt method
		System.out.println(list.getNodeAt(3)); */
		
		// Calling reversePointers method
		reversePointers();
		
	}
}

   

 /* public class GetAtModified
{
	
} */

