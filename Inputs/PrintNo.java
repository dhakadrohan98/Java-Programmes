import java.util.*;

class PrintNo
{
	public static void main(String args[])
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int Number = n.nextInt();
		for(int j=1; j<=Number; j++)
		{
			System.out.print(+j + " ");
		}
	}
}