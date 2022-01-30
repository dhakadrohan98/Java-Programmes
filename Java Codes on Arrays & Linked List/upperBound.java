import java.util.*;
import java.io.*;

public class upperBound
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,2,2,2,3,3,3,9,11};
		int ans = -1;
		int low = 0;
		int high = arr.length-1;
		
		System.out.println("Original Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println( i+ ": " + arr[i] + "\t" );
		}
		
		System.out.println("\nEnter item: ");
		int item = sc.nextInt();
		
		//lowerBound code:
		while(low <= high) //Infinite Loop
		{
			int mid = (low+high)/2;
			
			if(item == arr[mid])
			{
				ans = mid;
				//System.out.println("ans: " + mid);
				low=mid+1;
			}
			else if(item < arr[mid] )
			{
				high = mid-1;
			}
			
			else
			{
				low = mid+1;
			}
			
        }
		System.out.println("upperBound: " +ans);
	}
}