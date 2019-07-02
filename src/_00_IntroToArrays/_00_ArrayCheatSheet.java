package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] array = {"one", "two", "three", "four", "five"};
		//2. print the third element in the array
	System.out.println(array[2]);
		//3. set the third element to a different value
	array[2] = "six";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < 5; i+=2) {
			System.out.println(array[i]);
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int j = 0; j < 5; j++) {
			System.out.println(array[j]);
		}
		//7. make an array of 50 integers
		int[] intArray = new int[50];
		Random RanInt = new Random();
		//8. use a for loop to make every value of the integer array a random number
		for(int k = 0; k < intArray.length; k++) {
			intArray[k] = RanInt.nextInt(50);
			System.out.println(intArray[k]);
		}
		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
