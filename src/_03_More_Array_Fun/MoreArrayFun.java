package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] array = {"one", "two", "three", "four"};
		printString(array);
		printRev(array);
		printSkip(array);
		printRandom(array);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printString(String[] array) {
		 for(int i = 0; i < array.length; i++) {
		 System.out.println(array[i]);
		 }
	 }
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printRev(String[] array) {
		 for(int j = array.length-1; j >= 0; j--) {
			 System.out.println(array[j]);
		 }
	 }
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printSkip(String[] array) {
		 for(int i = 0; i < array.length; i+=2) {
		 System.out.println(array[i]);
		 }
	 }
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printRandom(String[] array) {
         String temp = "";	
		 for(int i = 0; i < array.length; i++) {
			 Random input = new Random();
			 int output = input.nextInt(array.length);
			 int output2 = input.nextInt(array.length);
			temp = array[output];
			array[output] = array[output2];
			array[output2] = temp;
		 }
		 for (int j = 0; j < array.length; j++) {
			 System.out.println(array[j]);
		 }
			 }
			 
		 }
	 
	
	

