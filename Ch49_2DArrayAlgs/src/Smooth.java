import java.io.IOException;

class Smooth {
	public static void main(String[] args) throws IOException {
		int[][] image = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0 },
				{ 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0 },
				{ 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0 },
				{ 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0 },
				{ 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0 },
				{ 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0 },
				{ 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0 },
				{ 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		
		int[] d = {-1,0,1};

		// assume a rectangular image
		int[][] smooth = new int[image.length][image[0].length];

		// Compute the smoothed value for
		// non-edge locations in the image.
		int sum;
		for (int row = 1; row < image.length - 1; row++) {
			for (int col = 1; col < image[row].length - 1; col++) {
				sum = 0;
				for (int x = 0; x < 3; x++)
				{
					for (int y = 0; y < 3; y++)
					{
						sum += image[row+d[x]][col+d[y]];
					}
				}
				smooth[row][col] = sum / 9;
			}
		}

		// write out the input
		System.out.println("Input: ");
		for (int i = 0; i < image.length; i++)
		{
			for (int j = 0; j < image[i].length; j++)
			{
				System.out.print(image[i][j] + " ");
			}
			System.out.println("");
		}
		
		// write out the result
		System.out.println("\nOutput: ");
		for (int i = 0; i < smooth.length; i++)
		{
			for (int j = 0; j < smooth[i].length; j++)
			{
				System.out.print(smooth[i][j] + " ");
			}
			System.out.println();
		}

	}
}


