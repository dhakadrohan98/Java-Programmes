class unWrapping
{
	public static void main(String args[])
	{
		int b = 10; 

		//wrapping around Integer object 
		Integer intobj = new Integer(b); 
				System.out.println("Integer object intobj: " + intobj); 

		int iv = intobj.intValue(); 
		System.out.println("Unwrapped values (printing as data types)"); 
		//System.out.println("byte value, bv: " + bv); 
		System.out.println("int value, iv: " + iv); 
	}
}