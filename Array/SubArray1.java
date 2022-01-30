import java.io.*;
import java.util.*;

public class SubArray1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i,j,count=0;
        int a[] = new int[n];
        for(i=0; i<a.length; i++)
            a[i]=s.nextInt();


        for(i=0; i<n; i++)
        {
            for(j=i; j<n; j++)
            {
                int sum=0;
                for(int k=i; k<=j; k++)
                {
                    sum+=a[k];
                }
                if(sum<0)
                  count++;
            }

        }
        System.out.println(count);
    }
}

