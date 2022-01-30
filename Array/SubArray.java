import java.util.*;

class SubArray
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j,count=0, sum1=Integer.MIN_VALUE, sum2=Integer.MIN_VALUE;
		int a[] = new int[5];
		for(i=0; i<a.length; i++)
			a[i]=s.nextInt();
		
		for(i=0; i<a.length; i++)
		{
			if(a[i]<0)
				count+=1;
			sum1+=a[i];
		}
		if(sum1<0)
			count+=1;
		
		for(i=0; i<a.length; i++)
		{
			if(i==4)
				continue;
			else  {
			sum2+= a[i]+a[i+1];
			if(sum2<0)
				count+=1;
		
		    for(j=i+2; j<n; j++)
		    {
				sum2+=a[j];
				if(sum2<0)
					count+=1;
			
		    }
		  }
		}
		System.out.println(count);
			
	}
}