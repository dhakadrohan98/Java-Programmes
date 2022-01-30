import java.util.*;

class Testriding_1
{
	void show(int a)
	{
		System.out.println("Parent class");
	}
}

class Testriding_2 extends Testriding_1
{
	void show(int a)
	{
		System.out.println("Child class");
	}
	
	public static void main(String args[])
	{
		Testriding_1 t1 = new Testriding_1();
		Testriding_2 t2 = new Testriding_2();
		t2.show(10);
		t1.show(10);
	}
}