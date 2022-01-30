import java.util.*;
import java.io.*;

public class insertionSort
{
	public static void main(String[] args)
	{
		int arr[] = {88,77,66,55,44};
		
		System.out.println("Original Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println( arr[i] + "\t");
		}
		
		//Insertion Sort code:
		
		for(int counter=1; counter<=arr.length-1 ; counter++)
		{
			int val = arr[counter];
			
			int j = counter -1;
			while( j>=0 && arr[j] > val)
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = val;
			
		   System.out.println("" + counter + " Iteration: ");
		   for(int i=0; i<arr.length; i++)
		   {
			   System.out.println( arr[i] + "\t");
		   }
		}
		
		//Sorted array
		System.out.println();
		System.out.println("Sorted Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println( arr[i] + "\t");
		}
		
	}
}