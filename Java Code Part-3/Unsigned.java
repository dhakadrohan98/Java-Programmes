class Unsigned
{ 
	public static void main(String args[])
	{
		int number = 0b1111_1000_1111_1010_1111_1000_1111_1010; 
	    System.out.println("Before unsigned right shift : " + Integer.toBinaryString(number)); 
	    System.out.println("number in decimal format : " + number); 
	    number = number >>> 1; 
	    System.out.println("After unsigned right shift : " + Integer.toBinaryString(number)); 
	    System.out.println("number in decimal format : " + number);
	} 
	
}