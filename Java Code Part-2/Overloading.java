class Room
{
	float length,width;
	Room (float x,float y)  //constructor1
	{
		length = x;
		width = y;
	}
	
	Room(float x)   ////constructor2
	{
		length = width = x;
	}
	
	float area()
	{
		return (length*width);
	}
}

    class Overloading
	{
		public static void main(String args[])
		{
			//Rectangle rect1 = new Rectangle(15,10);
			Room room1 = new Room(25,15); // An object representing rectangle room
			Room room2 = new Room(20);    // // An object representing square room
			System.out.println(room1.area());
			System.out.println(room2.area());
			
		}
	}
