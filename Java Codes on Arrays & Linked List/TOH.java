import java.io.*;
import java.lang.*;
public class TOH
{
	static void towerOfHanoi(int n, char src, char aux, char des)
	{
		if(n==1)
		{
			System.out.println("Take disk 1 from src " +src + " to des "+des );
			return;
		}
		
		towerOfHanoi(n-1,src,aux,des);
		System.out.println("Take disk " +n + " from src " +src +" to des" +des);
		
		towerOfHanoi(n-1,aux,des,src);
	}
	
	public static void main(String[] args)
	{
		int n=3;
		towerOfHanoi(n,'A','B','C');
	}
	
}