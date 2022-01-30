class TypeWrap
{
	public static void main(String args[])
	{
		System.out.println("variable created");
		char c = 'x';
		byte b = 50;
		short s = 1996;
		int i = 123456789;
		long l = 1234567654321L;
		float f1 = 3.124F;
		float f2 = 1.2e-5F;
		double d2 = 0.000000987;
		
		System.out.println("c = " +c + "\nb = "+b + "\ns = "+s + "\ni = "+i + "\nl = "+l + "\nf1 = "+f1 + "\nf2 = "+f2 + "\nd2 = "+d2);
		System.out.println("  ");
		System.out.println("types converted");
		short s1 = b;
		short s2 =(short)i;
		float n1 =(float)l;
		int m1 = (int)f1;
		
		System.out.println("b = "+s1 + "\ni= "+s2 + "\nl = "+n1 + "\nf1 = "+m1);
	}
}