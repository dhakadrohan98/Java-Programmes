import java.util.*;

public class InsertTail
{
	Node head;
	static class Node
	{
		int data;
		Node next;
	}
	
	public Node append(int new_data)
	{
		Node new_node = new Node();
		new_node.data = new_data;
		new_node.next = null;
		if(head == null)
		{
			head=new_node;
			return head;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next= new_node;
			return head;
		}
	}
	
	public void printList(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String []args)
	{
		InsertTail obj = new InsertTail();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			int new_data = sc.nextInt();
			obj.append(new_data);
		}
		obj.printList(obj.head);
		
		
		
	}
	
}
