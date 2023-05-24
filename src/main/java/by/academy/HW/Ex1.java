package by.academy.HW;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сумму: ");
		double price = sc.nextDouble();
		System.out.println("Возраст покупателя? ");
		int age = sc.nextInt();
		sc.close();

		double discont = 0.0;
		if (price < 100) {
			discont = 0.05;
		} else if (price >= 100 && price < 200) {
			discont = 0.07;
		} else if (price >= 200 && price < 300) {
			discont = 0.12;
			if (age > 18) {
				discont += 0.04;
			} else {
				discont -= 0.03;
			}
		} else if (price >= 300 && price < 400) {
			discont = 0.15;
		} else if (price > 400) {
			discont = 0.2;
		}
		double finalPrice = price - (price * discont);
		System.out.println("Итоговая цена : " + finalPrice);
	}
}
