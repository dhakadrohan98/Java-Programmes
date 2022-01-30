import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArrays {


    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);		
        System.out.println("Enter length of string: ");
		int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];
		System.out.println("Enter String one by one: ");

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        System.out.println("Enter length of queries: ");
		int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];
		System.out.println("Enter queries one by one: ");

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        for(int i=0; i<queriesCount; i++)
		{
			int count=0;
			for(int j=0; j<stringsCount; j++)
			{
				if(queries[i].equals(strings[j]))
					count++;
			}
			System.out.println(count);
		}
		
        scanner.close();
    }
}
