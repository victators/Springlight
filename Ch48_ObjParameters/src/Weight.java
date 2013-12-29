import java.io.*;

class Weight {
	int[] data;

	// Constructor
	Weight(int[] init)
	{
		// Construct the array the same length
		// as that referenced by init.
		data = new int[init.length];
    
				// Copy values from the 
				// input data to data.
   		for (int j = 0; j < data.length; j++)
   		{
   			data[j] = init[j];
   		}
	}

	// Print
	void print()
	{
		for (int j = 0; j < data.length; j++)
		{
			if (j > 0 && j%7 == 0)
			{
				System.out.println();
			}
			System.out.print(data[j] + " ");
		}
		System.out.println();
	}
	
	int average()
	{
		int sum = 0;
		for (int j = 0; j < data.length; j++)
		{
			sum += data[j];
		}
		return sum/data.length;
	}

	int subAverage(int start, int end)
	{
		int sum = 0;
		for (int j = start; j <= end; j++)
		{
			sum += data[j];
		}
		return sum/(end-start+1);
	}
	
	public static void main(String[] args) {
		int[] values = { 98, 99, 98, 99, 100, 101, 102, 100, 104, 105, 105,
				106, 105, 103, 104, 103, 105, 106, 107, 106, 105, 105, 104,
				104, 103, 102, 102, 101, 100, 102 };
		Weight june = new Weight(values);
		june.print();
		int avg = june.average();
	    System.out.println("average = " + avg );
	    int half1 = june.subAverage(0,14);
	    int half2 = june.subAverage(15,29);
	    System.out.println("average of first half = " + half1);
	    System.out.println("average of second half = " + half2);
	    System.out.println("difference = " + Math.abs(half1-half2));
	}
}
