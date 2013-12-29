import java.io.IOException;

class ColSums {
	
	public static void main(String[] args) throws IOException {
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 },
				{ 0, 2, 6, 3, -1, -8 } };

		// declare the sum
		int sum;
		int max = data[0].length;
		for (int i = 0; i < data.length; i++)
		{
			if (max < data[i].length)
			{
				max = data[i].length;
			}
		}
		// compute the sums for each column
		for (int col = 0; col < max; col++) {
			// initialize the sum
			sum = 0;
			// compute the sum for this column
			for (int row = 0; row < data.length; row++) {
				if (col < data[row].length)
				{
					sum += data[row][col];
				}
			}
			
			// write the sum for this column
			System.out.println(sum);
		}

	}
}

