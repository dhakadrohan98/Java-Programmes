class Casting
{
	public static void main(String args[])
	{
		float sum = 0.0F;
		int i;
		for(i=1; i<=10; i++)
		{
			sum+=1/(float)i;// Data type of int is converted into float temporarily for execution of this line statement.
			System.out.println(" i = "+i + "  sum = "+sum);
		}
		System.out.println("\n i = "+i);
	}
}