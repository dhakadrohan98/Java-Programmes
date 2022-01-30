import java.util.*;
import java.lang.*;
import java.io.*;

class Rotation {
	public static void main (String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//int T = s.nextInt();
		int N = s.nextInt();
		int D = s.nextInt();
		int a[] = new int[N];
		//int i;
		for(int i=0;i<a.length; i++)
		{
		    a[i]=s.nextInt();
		}
		
		for(int i=0;i<a.length; i++)
		{
		    a[i]=a[(i+D)%a.length];
		    System.out.print(a[i] + " ");
		}
	}
}