import java.util.*;
class ArraySorting
{
	public static void main(String args[])
	{
		int a[]= new int[10];
		int i,j;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = obj.nextInt();
		System.out.println("enter elements one by one:");
		for(i=0; i<n; i++)
		{
			a[i]= obj.nextInt();
		}
		
		System.out.println("Before Sorting");
		for(i=0; i<n; i++)
			System.out.print(" "+a[i]);
		int size = a.length;
		
		//System.out.println("Size = "+size);
		
		//System.out.println("After Sorting");
		for(i=0 ; i<n; i++)
		{
			for(j=i+1; j<n; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for(i=0; i<n; i++)
			System.out.print(" "+a[i]);
		
		System.out.println(" ");
	}	
}
