package anand.logical;

public class FindMinimumPostive {

	public static void main(String[] args) {
		FindMinimumPostive obj = new FindMinimumPostive();
		int arr[] = { 0, 10, 2, -10, -20 };
		int arr_size = arr.length;
		int missing = obj.findMissing(arr, arr_size);
		System.out.println("The smallest positive missing number is " + missing);
	}

	/*
	 * Find the smallest positive missing number in an array that contains both
	 * positive and negative integers
	 */
	private int findMissing(int arr[], int size) {
		// First separate positive and
		// negative numbers
		int shift = segregate(arr, size);
		int arr2[] = new int[size - shift];
		int j = 0;
		for (int i = shift; i < size; i++) {
			arr2[j] = arr[i];
			j++;
		}
		// Shift the array and call
		// findMissingPositive for
		// positive part
		return findMissingPositive(arr2, j);
	}
	
	/*
	 * Utility function that puts all non-positive (0 and negative) numbers on left
	 * side of arr[] and return count of such numbers
	 */
	private int segregate(int arr[], int size) {
		int j = 0, i;
		for (i = 0; i < size; i++) {
			if (arr[i] <= 0) {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				// increment count of non-positive
				// integers
				j++;
			}
		}

		return j;
	}
	
	/*
	 * Find the smallest positive missing number in an array that contains all
	 * positive integers
	 */
	private int findMissingPositive(int arr[], int size) {
		int i;

		// Mark arr[i] as visited by making
		// arr[arr[i] - 1] negative. Note that
		// 1 is subtracted because index start
		// from 0 and positive numbers start from 1
		for (i = 0; i < size; i++) {
			if (Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
		}

		// Return the first index value at which
		// is positive
		for (i = 0; i < size; i++)
			if (arr[i] > 0)
				return i + 1; // 1 is added becuase indexes
								// start from 0

		return size + 1;
	}
}
