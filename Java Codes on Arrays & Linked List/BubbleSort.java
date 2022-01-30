import java.util.*;
import java.io.*;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int arr[] = {88,77,66,55,44};
		
		System.out.println("Original Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println( arr[i] + "\t");
		}
		
		for(int counter=0; counter< arr.length-1; counter++)
		{
			for(int j=0; j< arr.length-1-counter; j++)
				
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j+1] = temp;
			}
		}
		
		System.out.println("\nSorted Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println( arr[i] + "\t");
		}
		
	}
}