package _01_Simple_Array_Algorithms;

import java.util.Random;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int intSum = 0;
		for (int i = 0; i < values.length; i++) {
			intSum += values[i];
		}
		
		return intSum;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		double intAvg = 0;
				for (int i = 0; i < values.length; i++) {
					intAvg += values[i];
				}
				 intAvg /= values.length;
		return intAvg;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		int containsInt = 0;
		for (int i = 0; i < array.length; i++) {
		containsInt = i;
		}
		if (array[containsInt] == value) {
			return true;
		}
		else {
		return false;
		}
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		
		return 0;
	}
}
