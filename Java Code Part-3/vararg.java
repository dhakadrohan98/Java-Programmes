class vararg
{
	vararg(String... person)
	{
		for(String name:  person)
			System.out.println("Hello "+name);
	}
	public static void main(String args[])
	{
		vararg("John", "David", "Suhel");
	}
}