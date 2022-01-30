import java.util.*; 
class CityGuide
{
	public static void main(String args[])
	{
		System.out.println("Select your choice");
		System.out.println(" M -> Madras");
		System.out.println(" B -> Bombay");
		System.out.println(" C -> Calcutta");
		System.out.println("Choice ---> ");
		Scanner sc = new Scanner(System.in);
		char choice = sc.next().charAt(0);
		switch (choice)
		{
			case 'M':
			case 'm':  System.out.println("Madras : Booklet 5");
			           break;
			case 'B':
			case 'b':  System.out.println("Bombay : Booklet 9");
			           System.out.println("anthingkd dk");
			           break;
			case 'C':
			case 'c':  System.out.println("Calcutta : Booklet 15");
			           break;
			default:   System.out.println("Invalid choice");//It is an Optional case.
		}
		
	}
}