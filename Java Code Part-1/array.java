import java.util.*;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int i=0;
        System.out.println("Please enter elements...");
        char[] a=sc.next().toCharArray();
        System.out.println("Array elements are : ");
        //for (int i=0;i<a.length;i++)
		while(i<a.length)  {
        System.out.println(a[i]);
		i++;   }
    }
}//program run successfully