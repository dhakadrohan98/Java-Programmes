class Error2
{
	public static void main(String args[])
	{
		int a=10, b=5, c=5;
		try
		{
			int x = a/(b-c);
		    
		}
		catch(Exception e)
		{
			//System.out.println("x = "+x);
			int y = a/(b+c);
		    System.out.println("y = "+y);
		}
	}
}