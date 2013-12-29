import java.io.*;

class Smooth {

	public static void main ( String[] args )  
	{
		int[] signal  = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
		int l = signal.length;
		int[] smooth = new int[l];
    
    // compute the smoothed value for each
    //  cell of the array smooth
    smooth[0]  =  (signal[0] + signal[1])/2;
    smooth[l-1] = (signal[l-2] + signal[l-1])/2;
    
    for (int i = 1; i < l - 1; i++)
    {
    	smooth[i] = (signal[i-1] + signal[i] + signal[i+1])/3;
    }
      
    // write out the input
    for (int j = 0; j < l; j++)
    {
    	System.out.print(signal[j]+ " ");
    }
    System.out.println();
    
    // write out the result
    for (int j = 0; j < l; j++)
    {
    	System.out.print(smooth[j] + " ");
    }

  }
}
