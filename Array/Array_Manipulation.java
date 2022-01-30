import java.util.Scanner;

public class Array_Manipulation {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        //Input the size of the array and the number of manipulations
        int n = s.nextInt();
        int t = s.nextInt();
            
        //Allocate the memory to the array dynamically as n can be of order 10^7 and use long as values after summing may exceed range of int
        long[] arr = new long[n + 2];    //Keep the size n+2 as we'll be using 1-indexed array and we're also accessing (b+1)th element
        //Initial value of elements of array is 0 by default.

        while (t-- > 0) {
            //Input indices and value to be added
            int a = s.nextInt();
            int b = s.nextInt();
            int k = s.nextInt();
            arr[a] += k;        //Add the value to the left index
            arr[b + 1] -= k;    //Subtract the value from the element at b+1 index
        }
        
        long res = 0;   //res will store the answer to the problem, i.e., maximum value present in the array after all the manipulations

        //This is the implementation of prefix sum array (or cumulative array)
        //Iterating through all the elements, we'll keep adding the elements left to right
        for (int i = 1; i <= n; i++) {
            arr[i] += arr[i - 1];
            res = Math.max(arr[i], res);     //Simultaneously update res if current element is greater than res
        }

        System.out.println(res);     //Finally print the result.

    }

}