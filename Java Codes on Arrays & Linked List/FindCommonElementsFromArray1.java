import java.util.*;
import java.io.*;

public class FindCommonElementsFromArray1
{
   public static void main(String args[])
   {
	int inputArray1 [] = {20,30,32,100,199,201,500};
	int inputArray2 [] = {600,500,30,201,299,900,901};
	
	for(int i=0; i<inputArray1.length; i++)
	{
		for(int j=0; j<inputArray2.length; j++)
		{
			if(inputArray1[i]==inputArray2[j])
			{
				System.out.println(inputArray1[i]);
				break;
			}
		}
	}
   }
}