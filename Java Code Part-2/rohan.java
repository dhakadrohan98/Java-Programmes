//import java.lang;
class rohan
{
	//static String name[] ={"Madras", "Delhi"};
	public static void main(String args[])
	{
		String name[] ={"Madras", "Delhi", "Ahemdabad"};
		int size = name.length;
		System.out.println("Size = "+size);
		String temp = null;
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if (name[j].compareTo(name[i]) < 0)
				{
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		//int less = size-1;
		for(int i=size-1; i>=0; i--)
		{
			System.out.println(""+name[i]);
		}
	}	
}