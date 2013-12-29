import java.io.*;
import java.util.*;

class arr {
	public static void main(String[] args) {
		int[] test = new int[2];
		test[0] = 0;
		test[1] = 1;
		swap(test);
		System.out.println("test[0] = " + test[0]);
		System.out.println("test[1] = " + test[1]);
	}

	private static void swap(int[] i) {
		int temp = i[0];
		i[0] = i[1];
		i[1] = temp;
	}
}