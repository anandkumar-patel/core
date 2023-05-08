package anand.learn;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {

		TestClass obj = new TestClass();
		
		int []data = {11,12,13,16,17,19};
		int []shiftedArray = obj.arrayRotation(data, 1);
		System.out.println("Hiiii "+Arrays.toString(shiftedArray));
	}
	
	public int[] arrayRotation(int[] data, int shift) {
		int size = data.length;
		if (size == 1)
			return data;
		int []shftedArray = new int[size];
		int i =0 ,j=0;
		while(i<size){
			if(i+shift<size) {
				shftedArray[i] =data[i+shift];
				i++;
			} else {
				shftedArray[i] =data[size-i-shift];
				i++;
			}
			
		}
		return shftedArray;
	}

}
