import ownpack.*;
class ClassC extends ClassB
{
	int n = 20;
	void displayC()
	{
		System.out.println("Class C");
		System.out.println("m = "+m);
		System.out.println("n = "+n);
	}
}

class SubClsPkg
{
	public static void main(String args[])
	{
		ClassC objC = new ClassC();
		objC.displayB();
		objC.displayC();
	}
}
