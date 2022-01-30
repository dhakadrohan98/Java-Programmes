import java.io.*;

public class Factorial{
	
	static int Fact(int n){
		if(n==1||n==0)
			return 1;
		else
			return n*Fact(n-1);
		
	}
	
	public static void main(String[] args)
	{
		int n=6;
		System.out.println(Fact(n));
	}
}