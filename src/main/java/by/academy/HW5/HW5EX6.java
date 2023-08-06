package by.academy.HW5;

import java.util.Arrays;

public class HW5EX6 {
	public static void main(String[] args) {
		int[] array = new int[8];
		for (int i = 1; i < 10; i++) {
			try {
				array[i] = i;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array is to small, expand the array");
				break;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
