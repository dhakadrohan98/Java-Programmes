import java.util.*;
class Overloading
{
	static void show(int a)
	{
		System.out.println("Method 1");
	}
	
	static void show(String a)
	{
		System.out.println("Method 2");
	}
	
	public static void main(String args[])
	{
		Overloading t = new Overloading();
		t.show(10);
		t.show("abc");
	}
}