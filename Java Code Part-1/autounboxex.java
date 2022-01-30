// Program not runned successfully.
import java.util.Stack;
public class autounboxex
{
	public static void main(String args[])
	{
		Stack<Integer> MyStack = new Stack<Integer>();
		myStack.push(10);
		myStack.push(20);
		int stackSum = myStack.pop() + myStack.pop();
		System.out.println("First element: "+myStack.pop());
		System.out.println("2nd element: "+myStack.pop());
		System.out.println("Sum: "+stackSum);
	}
}