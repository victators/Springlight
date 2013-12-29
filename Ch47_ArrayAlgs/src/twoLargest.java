import java.io.*;
import java.util.*;

class twoLargest {
	public static void main(String[] args) {

		int[] data = { 3, 1, 5, 9, 4, 12, -3, 8, -2 };

		// declare and initialize variables for the two largest
		int M = data[0];
		int m = data[0];

		// compute the two largest
		for (int index = 0; index < data.length; index++) {
			if (data[index] > M) {
				m = m > M ? m: M;
				M = data[index];
			} else if (data[index] > m) {
				m = data[index];
			}
		}

		// write out the two largest
		System.out.println("The two largest numbers are " + M + " and " + m
				+ ".");

	}
}
