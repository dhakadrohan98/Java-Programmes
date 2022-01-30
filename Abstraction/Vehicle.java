abstract class Vehicle
{
	//int tyres;
	//abstract void start();
}

class Car extends Vehicle
{
	int tyres=4;
	void start()
	{
		System.out.println("\nTyres= "+tyres + "\tstart with key");
	}
}

class Scooter extends Vehicle
{
	int tyres=2;
	void start()
	{
		System.out.println("\nTyres= "+tyres + "\tstart with kick");
	}
	public static void main(String[]args)
	{
		Car c = new Car();
		Scooter s = new Scooter();
		c.start();
		s.start();
	}
}


