package anand.learn.collection.map;

public class HashMapExample01 {

	public static void main(String[] args) {
		int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};
         
        int m = arr1.length;
        int n = arr2.length;
     
        if(isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is "
                  + "subset of arr1[] ");
        else
            System.out.print("arr2[] is "
             + "not a subset of arr1[]"); 
	}

	private static boolean isSubset(int []arr1, int []arr2, int m, int n) {
		return false;
	}
}
