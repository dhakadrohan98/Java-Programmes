import java.util.*;
class Student
{
    int m1,m2;
	void getMarks(int x,int y)
	{
		m1=x;
		m2=y;
	}
	
	void putMarks()
	{
		System.out.println("First "+m1);
		System.out.println("\nSecond "+m2);
	}
}

interface Sport
{
	int sp=6;
	void spmarks();
}

class Result extends Student implements Sport
{
	int total;
	public void spmarks()
	{
		System.out.println("\nspmarks "+sp);
	}
	
	void display()
	{
		putMarks();
		spmarks();
		total = m1+m2+sp;
		System.out.println("\nTotal marks= "+total);
		
	}
	
}

class Multiple_Inheritance
{
	public static void main(String args[])
	{
		Result obj = new Result();
		obj.getMarks(50,60);
		obj.display();
	}
}












