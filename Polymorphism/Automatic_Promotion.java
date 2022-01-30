class Automatic_Promotion
{
	void show(int a)
	{
		System.out.println("int method");
	}
	
	void show(String a)
	{
		System.out.println("string method");
	}
	
	public static void main(String args[])
	{
		Automatic_Promotion obj = new Automatic_Promotion();
		obj.show('b');
	}
}