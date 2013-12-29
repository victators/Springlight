import java.io.IOException;

class Exercise5 {

	static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void reverse(int[] arr)
	{
		for (int i = 0; i < arr.length/2; i++)
		{
			swap(arr, i, arr.length-i-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		int[] data = 
				{ 0, 2, 6, 3, -1, -8 } ;

		reverse(data);
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		
	}
}
