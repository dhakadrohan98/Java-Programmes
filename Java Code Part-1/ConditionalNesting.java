import java.util.*;
class ConditionalNesting
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x = sc.nextInt();
		double salary;
		salary = (x!=40)? (( x<40) ? (4*x+100) : (4.5*x+150)) : 300;
		System.out.println("Salary = "+salary);
	}
}
