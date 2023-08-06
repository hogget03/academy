package by.academy.HW2;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity of words: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the" + (i + 1) + "word: ");
			array[i] = sc.nextLine();
		}
		sc.close();
		int indexMin = 0;
		for (int i = 0; i < n; i++) {
			if (array[i].length() < array[indexMin].length())
				indexMin = i;
		}

		System.out.println("First word with min chars: " + array[indexMin]);
	}

}
