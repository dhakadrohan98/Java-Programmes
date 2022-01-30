import java.util.*;
public class test3 {

    public static void main(String args[])
    {
        char crr[]=new char[100];
        Scanner inputs=new Scanner(System.in);
        System.out.println("enter the string");
        for(int i=0;i<10;i++)
        {
            char c=inputs.next().charAt(0);
            crr[i]= c;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(" " +crr[i]);
        }
    }
}