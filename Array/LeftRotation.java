import java.util.*;
class LeftRotation
{
	void leftRotate(int arr[], int n, int d) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr, n); 
    } 
  
    void leftRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
	
	void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    public static void main(String args[])
	{
		LeftRotation l = new LeftRotation();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=s.nextInt();
	    
		l.leftRotate(arr,n,d);
		l.printArray(arr,n);
			
	}
}