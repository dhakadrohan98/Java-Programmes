class Room
{
	int length,breadth;
	Room(int x,int y)  // Base constructor 
	{
		length = x;
		breadth = y;
	}
	
	int area()
	{
		return (length*breadth);
	}	
}
	
	class BedRoom extends Room
	{
		int height;
		BedRoom(int x,int y,int z) //constructor method
		{
			super(x,y);
			height = z;
		}
		int volume()
		{
			return length*breadth*height;
		}
		
	}
	
	class InherTest
	{
		public static void main (String args[])
		{
			BedRoom room1 = new BedRoom(14,12,10);
			int area1 = room1.area();
			int volume = room1.volume();
			System.out.println("Area1 = "+area1);
			System.out.println("Volume = "+volume);
		}
	}

	
