import java.util.Scanner;
 
public class ReadTwoDimensionalDemo {
        public static void main(String[] args) {
 
                Scanner scan = new Scanner(System.in);
 
                int inputArr[][] = new int[5][5];
 
                System.out.println("Enter the number of rows : ");
                int noOfRows = scan.nextInt();
                System.out.println("Enter the number of columns : ");
                int noOfCols = scan.nextInt();
 
                int noOfElements = noOfRows * noOfCols;
 
                System.out.println("Please enter " + noOfElements + " elements nows.");
 
                // read array elements row wise.
                for (int i = 0; i < noOfRows; i++) {
                        for (int j = 0; j < noOfRows; j++) {
                                inputArr[i][j] = scan.nextInt();
                        }
                }
 
                // close the scanner
                scan.close();
                System.out.println("The Input array is :");
                for (int i = 0; i < noOfRows; i++) {
                        for (int j = 0; j < noOfRows; j++) {
                                System.out.print(inputArr[i][j] + "\t");
                        }
                        System.out.println();
                }
        }
}