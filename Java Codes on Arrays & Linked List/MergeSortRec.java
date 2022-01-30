import java.util.*;
import java.io.*;

public class MergeSortRec
{
	static int temp [] = new int[6]; 
	
    static void Merge(int arr[], int temp[], int lb, int mid, int up)
    {
		int i = lb;
		int j = mid+1;
		int k = lb;
		
		while( i<=mid && j<=up )
		{
			if( arr[i] <= arr[j] )
			{
				temp[k] = arr[i];
				i++;
				k++;
			}
			
			else
			{
				temp[k] = arr[j];
				j++;
				k++;
			}
		}
		
		if(i > mid)
		{
			while( j<=up)
			{
				temp[k] = arr[j];
				j++;
				k++;
			}
		}
		
		else 
		{
			while( i<=mid)
			{
				temp[k] = arr[i];
				i++;
				k++;
			}
		}
		
		// Putting temp[] values in arr[] after sorting
		for( k=lb; k<=up; k++)
		{
			arr[k]=temp[k];
		}
		
		
	}	
	
	
	static void MergeSort(int arr[], int lb,int up)
	{
		int mid;
		if(lb<up)
		{
			mid = (lb+up)/2;
			MergeSort(arr,lb,mid);
			MergeSort(arr,mid+1,up);
			Merge(arr,temp,lb,mid,up);
			
		}
		
	}
	
	public static void main(String[] args)
	{
		int arr [] = new int[6];
		int temp [] = new int[6];
	    Scanner sc = new Scanner(System.in);
	    int i;
	
	    System.out.println("Enter 5 values of an array: ");
	
	    for(i=0; i<arr.length; i++)
	   {
		arr[i] = sc.nextInt();
	   }
	
	   MergeSort(arr,0,5);
	   
	   //Printing all values of Sorted array
		System.out.println("Sorted array: ");
		
		for ( i=0; i<arr.length; i++)
		{
			System.out.println(i+1 + " value: " + arr[i]);
		}
		
	}
	
}