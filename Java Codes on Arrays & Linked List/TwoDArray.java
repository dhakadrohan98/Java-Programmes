import java.util.*;
import java.io.*;

public class TwoDArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int rows, columns;
		int i,j;
		System.out.println("Enter number of rows & columns: ");
		rows = sc.nextInt();
		columns = sc.nextInt(); 
		int array[][] = new int[rows][columns];
		System.out.println("Enter only integer values of matrix: ");
		
		for (i=0; i<rows; i++)
		{
			for (j=0; j<columns; j++)
		  {
			array[i][j] = sc.nextInt();
		  }
		}
		
		//sc.close();
		
		System.out.println("Entered values of Matrix: ");
		for (i=0; i<rows; i++)
		{
			for (j=0; j<columns; j++)
		  {
			System.out.print(array[i][j] + "\t");
		  }
		  System.out.println();
		}
	}
}