package by.academy.lesson1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		int n = cs.nextInt();
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;

		}
		cs.close();
		System.out.println(result);
	}

}
