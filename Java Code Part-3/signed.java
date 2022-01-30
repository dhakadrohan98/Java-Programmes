class signed
{
	public static void main(String[] args)
	{
		int number = -2; 
		System.out.println(number); 
		System.out.println("Before shift : " + Integer.toBinaryString(number)); 
		number = number >> 1;
        System.out.println(number);
        System.out.println("After shift : " + Integer.toBinaryString(number));
	
	}
}
    	
    	