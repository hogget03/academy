package by.academy.lesson1;

import java.util.Scanner;

public class DayWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 8;

		if (x == 1) {
			System.out.println("Понедельник");
		} else if (x == 2) {
			System.out.println("Вторник");
		} else if (x == 3) {
			System.out.println("Среда");
		} else if (x == 4) {
			System.out.println("Четверг");
		} else if (x == 5) {
			System.out.println("Пятница");
		} else if (x == 6) {
			System.out.println("Суббота");
		} else if (x == 7) {
			System.out.println("Воскресенье");
		} else {
			System.out.println("Може быть такой и есть, но я его не знаю");
		}
	}
}
