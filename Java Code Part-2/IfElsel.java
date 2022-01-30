import java.util.*;
class IfElsel
{  
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int code; 
		System.out.println("Enter an integer: ");
		code = s.nextInt();
		//System.out.println(code);
		if(code != 1)
			if(code != 2)
				if(code != 3)
					System.out.println("Code = "+code + " : YELLOW");
				else
					System.out.println("Code = "+code + " : WHITE");
  			else
				System.out.println("Code = "+code + " : GREEN");
		else
            System.out.println("Code = "+code + " : RED");	
	}
}