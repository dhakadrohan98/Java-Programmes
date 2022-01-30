class Overriding
{
	private void show(int a)
	{
		System.out.println("1");
	}
}

class xyz extends Overriding
{
	void show(int a)
	{
		//super.show(10);
		System.out.println(2);
	}
	
	public static void main(String[]args)
	{
		//Overriding obj = new Overriding();
		xyz obj1 = new xyz();
		obj1.show(10);
		//obj.show(10);
	}
}