interface Area{
	final static float pi = 3.14f;
	float compute (float x, float y);
}

class Rectangle implements Area
{
	public float compute (float x, float y)
	{
		return x*y;
	}
}

class Circle implements Area
{
	public float compute (float x, float y)
	{
		return pi*x*x;
	}
}

class InterfaceTest
{
	public static void main(String argsp[])
	{
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		Area area; // It is optional.
		
		area = rect;
		System.out.println("AOR = "+area.compute(10, 20));
		
		area = cir;
		System.out.println("AOC = "+area.compute(10, 0));
		 
	}
}