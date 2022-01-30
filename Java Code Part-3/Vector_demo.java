// Java code illustrating add() method 
import java.util.Vector; 
class Vector_demo { 
	public static void main(String[] arg) 
	{ 

		// create default vector 
		Vector v = new Vector(); 

		v.add(0, 1); 
		v.add(1, 2); 
		v.add(2, "geeks"); 
		v.add(3, "forGeeks"); 
		v.add(4, 3); 

		System.out.println("Vector is " + v); 
	} 
}
