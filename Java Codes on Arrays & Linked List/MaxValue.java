import java.util.*;
import java.io.*;

public class MaxValue {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int m, i;
		
		System.out.println("Enter 5 values of array: ");
		
		for (i=0; i<a.length; i++)
		{
			m = sc.nextInt();
			a[i] = m;
		}
		
		//MaxValue Code:
		
		for (i=0; i<a.length; i++)
		{
			if( max < a[i])
			{
				max = a[i];
			}
		}
		
		System.out.println("\nMaxValue is "+ max);
        
    }

}