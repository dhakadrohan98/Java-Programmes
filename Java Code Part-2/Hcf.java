import java.util.*;
class Hcf
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,small,i;
		System.out.print("Enter Two Numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		small = n1<n2?n1:n2;
		for(i=small; i>=1; i--)
		{
			if( n1%i==0 && n2%i==0)
			{
				System.out.println("HCF = "+i);
				break;
			}
		}
	}
}