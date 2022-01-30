import java.util.*;
class Whileloop
{
	public static void main(String args[])
	{
		int n,i=0;
		char sh[]; 
		sh = new char[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of stirng: ");
		n = sc.nextInt();   
		System.out.println("Enter a stirng: ");
		while(i<n)
		{
			sh[i] = sc.next().charAt(i);
			i++;
		}
		System.out.println("Entered stirng: ");
		i=0;
		while(i<n)
		{
			System.out.println(sh[i]);
			i++;
		}
	}
}