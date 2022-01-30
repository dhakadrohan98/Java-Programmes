import java.util.Vector;
public class bala
{
	public static void main(String args[])
	{
		Vector list = new Vector();
		int length = args.length;
		System.out.println("Length = "+length);
		for(int i=0; i<length; i++)
		{
			list.addElement(args[i]);
		}
		list.insertElementAt("COBOL",2);
		int size = list.size();
		System.out.println("size = "+size);
		String listArray[] = new String[size];
		System.out.println("List of languages");
		for(int i=0; i<size; i++)
			System.out.println(listArray[i]);
	}
}