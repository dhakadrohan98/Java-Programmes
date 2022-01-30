class EnhancedFor
{
	public static void main(String args[])
	{
		int[] numarray = {56,48,79};
		for (int j : numarray)
		{
			if (j>50 && j<100)
			{
				System.out.println("value = "+j);
			}
		}
	}
}
