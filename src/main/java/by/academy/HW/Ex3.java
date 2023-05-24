package by.academy.HW;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите цифру от 1 до 10");
		int n = sc.nextInt();
		sc.close();
		for (int k = 1; k < 11; k++) {
			System.out.print(n + "*" + k + "=" + k * n + "   ");
		}

	}

}
