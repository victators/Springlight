import java.io.*;

class NearlyZero {

	public static void main(String[] args) {
		int[] data = { 3, -1, 5, 7, 4, 12, -3, 8, -2 };

		// declare and initialize variables
		int close = Math.abs(data[0] - 0);
		int index = 0;

		// find the element nearest to zero
		for (int i = 0; i < data.length; i++) {
			if (Math.abs(data[i] - 0) < close) {
				close = Math.abs(data[i] - 0);
				index = i;
			}
		}

		// write out the element nearest to zero
		System.out.println(data[index]);

	}
}
