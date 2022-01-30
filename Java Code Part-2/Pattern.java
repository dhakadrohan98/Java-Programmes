import java .util.*;
class Pattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int n = sc.nextInt();
		int i,j,k;
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
				System.out.print(""+i + " ");
				
			//System.out.print(""+i + " ");
			System.out.println("\n");
		}
		
	}
}
