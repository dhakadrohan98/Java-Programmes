class Rectangle
{
	int length,width;
	Rectangle(int x, int y)
	{
		length = x;
		width = y;
	}
	int rectArea()
	{
		int area = length * width;
		return area;
	}
}

class Constructor
{
	public static void main(String args[])
	{
		int area1, area2;
		Rectangle rect1 = new Rectangle(15,10);
		//Rectangle rect2 = rect1;
		//rect1.getData (15,10);      //calling getData method using dot operator.
		area1 = rect1.rectArea();  //calling rectArea method using dot operator.
		//rect2.getData (20,12);
		//area2 = rect2.rectArea();
		System.out.println("Area1 = "+area1);
		//System.out.println("Area2 = "+area2);
	}
}
