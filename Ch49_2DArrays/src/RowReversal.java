import java.io.IOException;

class RowReversal {

	static void swap(int[][] d, int row, int a, int b)
	{
		int temp = d[row][a];
		d[row][a] = d[row][b];
		d[row][b] = temp;
	}
	
	static void rowReverse(int[][] d)
	{
		for (int i = 0; i < d.length; i++)
		{
			for (int j = 0; j < d[i].length/2; j++)
			{
				swap(d,i,j,d[i].length - j-1);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 },
				{ 0, 2, 6, 3, -1, -8 } };

		rowReverse(data);
		for (int i = 0; i < data.length; i++)
		{
			System.out.print("{");
			for (int j = 0; j < data[i].length; j++)
			{
				System.out.print(data[i][j]);
				if (j != data[i].length-1)
				{
					System.out.print(", ");
				}
			}
			System.out.print("},");
			System.out.println();
		}
		
	}
}
