class DoWhile
{
	public static void main(String args[])
	{
		int row,column,y;
		System.out.println("Multiplication Table \n");
		row = 1;
		do
		{
			column = 1;
			do
			{
				y = row*column;
				System.out.print(" "+y);
				column = column+1;
			}
			while (column <= 3);
			
		    System.out.println("\n");
		    row++;
		}
		while (row<=3);
	}
}