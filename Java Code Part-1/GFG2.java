import java.io.*; 
class GFG2 { 
	public static void main(String[] args) 
	{ 
		StringBuffer s = new StringBuffer("GeeksforGeeks"); 
		s.delete(0, 5); 
		System.out.println(s); // returns forGeeks 
		s.deleteCharAt(0); 
		System.out.println(s); // returns forGeek 
	} 
} 
