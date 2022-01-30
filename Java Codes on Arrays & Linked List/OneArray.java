import java.util.*;
import java.io.*;

public class OneArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int m;
		
		System.out.println("Enter 5 values of array: ");
		
		for (int i=0; i<a.length; i++)
		{
			m = sc.nextInt();
			a[i] = m;
		}
		
		System.out.println("Entered values of array: ");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(i+1 + " value: " + a[i]);
		}
	}
}