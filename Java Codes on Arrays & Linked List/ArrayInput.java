import java.util.*;
import java.io.*;

public class ArrayInput
{
	public static void main(String[] args)
	{
	 int arr [] = new int[6];
	 Scanner sc = new Scanner(System.in);
	 int i;
	
	 System.out.println("Enter 5 values of an array: ");
	
	 for(i=0; i<arr.length; i++)
	 {
		arr[i] = sc.nextInt();
	 }
	
	 System.out.println("Entered values: ");
	
	 for(i=0; i<arr.length; i++)
	 {
		System.out.println( i+1 + " Value: " + arr[i]);
	 }
	}
	
}