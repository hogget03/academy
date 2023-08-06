package by.academy.lesson20;

import by.academy.HW3.Deal.Product;
import lesson6.Apple;

public class lambda {
	public static void main(String[] agrs) {

		Printable<Product> printable = p -> System.out.println(p);
		Printable<Product> printable2 = p -> System.out.println(p);

		Apple apple = new Apple();
		printable.print(apple);
	}
}
