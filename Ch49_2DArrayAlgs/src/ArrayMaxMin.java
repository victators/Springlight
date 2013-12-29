import java.io.*;

import java.io.*;

class ArrayMaxMin {

	public static void main(String[] args) throws IOException {
		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 },
				{ 0, 2, 6, 3, -1, -8 } };

		// declare the max and the min
		int max = data[0][0];
		int min = data[0][0];

		// compute the sum
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (max < data[row][col]) {
					max = data[row][col];
				}
				if (min > data[row][col]) {
					min = data[row][col];
				}
			}
		}

		// write out the results
		System.out.println("The maximum is: " + max);
		System.out.println("The minimum is: " + min);

	}
}
