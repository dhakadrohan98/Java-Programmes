import java.util.*;
import java.io.*;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int arr[] = {5,7,10,12,15,20,27,31,35,42,55,58,60,65,70,80};
		Scanner sc = new Scanner(System.in);
		int mid, low, high;
		low = 0;
		high = arr.length-1;
		
		System.out.println("Enter item: ");
		int item = sc.nextInt();
		
		while(low <= high)
		{
			mid = (low+high)/2;
			
			if(item < arr[mid] )
			{
				high = mid-1;
			}
			
			else if(item > arr[mid])
			{
				low = mid+1;
			}
			else if(item == arr[mid])
			{
				System.out.println("Item found at position: " + (mid+1) );
				break;
			}
		}
	}
	
}