class ReturnValue
{
	String getName()
	{
	  String name="Tom";
	  return name;
	}
	public static void main(String args[])
	{
		ReturnValue rv = new ReturnValue();
		System.out.println(rv.getName());
	}
}