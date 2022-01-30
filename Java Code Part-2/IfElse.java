class IfElse
{
	public static void main(String args[])
	{
		int a[] = {50,65,56,71,81};
		int e=0,o=0;
		for(int i=0; i<a.length; i++)
		{
			if (a[i]%2==0)
				e+=1;
			else
				o+=1;
			System.out.println(i);
		}
		System.out.println("Even Number = "+e + "\t\tOdd Number = "+o);
	}
}