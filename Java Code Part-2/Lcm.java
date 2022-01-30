import java.util.*;
class Lcm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,big,i;
		System.out.print("Enter Two Numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		big = n1>n2?n1:n2;
		for(i=big; i<=n1*n2; i+=big)
		{
			if( i%n1==0 && i%n2==0)
			{
				System.out.println("lcm = "+i);
				break;
			}
		}
	}
}