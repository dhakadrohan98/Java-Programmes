import java.util.*;
import java.io.*;

public class MatrixMultiplication
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int rows1, columns1, rows2, columns2;
		int i,j,k;
		System.out.println("Enter number of rows & columns for first matrix: ");
		rows1 = sc.nextInt();
		columns1 = sc.nextInt(); 
		
		System.out.println("Enter equal value for columns1 & rows2, then only matrix mul. is possible.");
		
		System.out.println("Enter number of rows & columns for second matrix: ");
		rows2 = sc.nextInt();
		columns2 = sc.nextInt(); 
		
		int array1[][] = new int[rows1][columns1];
		int array2[][] = new int[rows2][columns2];
		int res[][] = new int[rows1][columns2];
		public class Main {
    public static void main(String[] args) {
        System.out.println(1.0/0.0);
        System.out.println(-1.0/0.0);
        double inf = 1.0/0.0;
        double negInf = -1.0/0.0;
    }

}
		System.out.println("Enter only integer values of for first matrix: ");
		for (i=0; i<rows1; i++)
		{
			for (j=0; j<columns1; j++)
		  {
			array1[i][j] = sc.nextInt();
		  }
		}
		
		System.out.println("Enter only integer values of for second matrix: ");
		for (i=0; i<rows2; i++)
		{
			for (j=0; j<columns2; j++)
		  {
			array2[i][j] = sc.nextInt();
		  }
		}
		
		//sc.close();
		
		System.out.println("Entered values of first Matrix: ");
		for (i=0; i<rows1; i++)
		{
			for (j=0; j<columns1; j++)
		  {
			System.out.print(array1[i][j] + "\t");
		  }
		  System.out.println();
		}
		
		System.out.println("Entered values of second Matrix: ");
		for (i=0; i<rows2; i++)
		{
			for (j=0; j<columns2; j++)
		  {
			System.out.print(array2[i][j] + "\t");
		  }
		  System.out.println();
		}
		
		//Matrix Multiplication code:
		System.out.println();
		System.out.println("Matrix Multiplication: ");
		
		for(i=0; i<rows1; i++)
		{
			for(j=0; j<columns2; j++)
			{
				for(k=0; k<rows2; k++)
				{
					res[i][j]+= array1[i][k]*array2[k][j];
				}
				System.out.print(res[i][j] + "\t");
			}
			System.out.println();
		}
	}
}