import java.util.*;

public class Compare_List
{
	
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) {data = d; next = null; } 
	} 
	static Node headA;
	static Node headB;
	
	public void push1(int new_data) 
	{ 
		/* 1 & 2: Allocate the Node & 
				Put in the data*/
		Node new_node = new Node(new_data); 

		/* 3. Make next of new Node as head */
		new_node.next = headA; 

		/* 4. Move the head to point to new Node */
		headA = new_node; 
	} 
	
	public void push2(int new_data) 
	{ 
		/* 1 & 2: Allocate the Node & 
				Put in the data*/
		Node new_node = new Node(new_data); 

		/* 3. Make next of new Node as head */
		new_node.next = headB; 

		/* 4. Move the head to point to new Node */
		headB = new_node; 
	} 
	
	public int length(Node head)
	{
		Node temp =head;
		int count=1;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	public int compareList(Node headA, Node headB)
	{
		if(this.length(headA)!=this.length(headB))
			return 0;
		else
		{
			while(headA!=null && headB!=null)
			{
				compareList(headA.next,headB.next);
				if(headA.data!=headB.data)
				{
					return 0;
				}
			}
			return 1;
		}
	}
	
	public static void main(String args[])
	{
	   //Nod;
	   //Node headB;
	   Compare_List obj = new Compare_List();
	   Scanner sc = new Scanner(System.in);
	   int n= sc.nextInt();
	   for(int i=1; i<=n; i++)
	   {
		   int new_data=sc.nextInt();
		   obj.push1(new_data);
	   }
	   
	   int m= sc.nextInt();
	   for(int j=1; j<=m; j++)
	   {
		   int new_data=sc.nextInt();
		   obj.push2(new_data);
	   }
	   int q = obj.compareList(headA ,headB);
	   System.out.println(q);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	


