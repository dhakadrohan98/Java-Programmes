class NoDefConst
{
	NoDefConst(String s)
	{
		System.out.println("fsdf");
	}
}

class Subclass extends NoDefConst
{
	NoDefConst o =new NoDefConst(Rohan);
	//public static void main(String args[]);
}