package Array.program;

import java.util.Arrays;
import java.util.Collections;

public class OrderStatistics {
	  public static int kthSmallest(Integer[] arr,int k)
	  {
		  // Sort the given array
		  Arrays.sort(arr);

		  // Return k'th element in
		  // the sorted array
		  return arr[k - 1];
	  }

	// driver program
	public static void main(String[] args)
	{
	Integer arr[] = new Integer[] { 9, 35, 51, 7, 92 };
	int k = 4;
	System.out.print("4'th smallest element is " + kthSmallest(arr, k));
	}
}
