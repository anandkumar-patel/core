package anand.learn.ds;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 12, 45, 21, 34, 78, 11, 37, 23 };
		int data[] = { 5, 4, 1, 2, 7 };
		bubleSortMethod(data);
		printArry(data);
	}

	public static void bubleSortMethod(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swap = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
			passprint(arr, i + 1);
			if (!swap)
				break;
		}
	}

	public static void printArry(int[] arr) {
		System.out.println("Final Array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void passprint(int[] arr, int pass) {
		System.out.println("After Pass : " + pass + "  :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println("");
	}
}

