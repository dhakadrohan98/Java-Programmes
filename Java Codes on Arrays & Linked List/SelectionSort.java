import java.util.*;
import java.io.*;

public class SelectionSort
{
	public static void main(String[] args)
	{
		int arr[] = {88,11,44,99,55};
		
		System.out.println("Original Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println( arr[i] + "\t");
		}
		
		for(int counter=0; counter< arr.length-1; counter++)
		{
			int min = counter;
			
			for(int j = counter+1; j<= arr.length-1; j++)
				
			if(arr[j] < arr[min])
			{
				min = j;
			}
			
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;
			
			System.out.println("After " + (counter+1) + " iteration: ");
		    for(int i=0; i<arr.length; i++)
		    {
			   System.out.println( arr[i] + "\t");
		    }
		}
		
		System.out.println("\nFinally Sorted Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println( arr[i] + "\t");
		}
		
	}
}