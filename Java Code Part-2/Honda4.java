abstract class Bike
{  
  abstract void run(); // Bike is an abstract class that contains only one abstract method run. Its implementation is provided by the Honda class. 
}  
class Honda4 extends Bike
{
	void run()
{
	System.out.println("running safely");
}  
public static void main(String args[]){  
 Bike obj = new Honda4();  
 obj.run();  
} 
