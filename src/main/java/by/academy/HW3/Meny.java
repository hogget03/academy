package by.academy.HW3;

import java.util.Scanner;

public class Meny {

	public static void main(String[] args) {
		printMenu();
		Scanner scan = new Scanner(System.in);
		int sc = scan.nextInt();
		Product[] array = new Product[10];

		Deal d = new Deal();
		while (sc != 0) {

			switch (sc) {
			case 0:
				return;
			case 1:
				Product p = createProduct(scan);
				if (p == null) {
					break;
				}
				d.addProduct(p);
				System.out.println(" add product");
				break;
			}
			printMenu();
			sc = scan.nextInt();

		}
		System.out.println("fin proggram");
		scan.close();
	}

	public static Product createProduct(Scanner scan) {
		System.out.println("Enter product type");
		String type = scan.next();
		switch (type) {
		case "Vinishko":
			System.out.println();
			String name = scan.next();
			System.out.println();
			int price = scan.nextInt();
			int quantity = scan.nextInt();
//			String color = scan.next();
//			int fortress = scan.nextInt();
			return new Vinishko(name, price, quantity);

		}
		return null;
	}

	public static void printMenu() {
		System.out.println("0- Exit proggram");
		System.out.println("1- Print product");
		
	}
	public static void addProduct() {
		
	}
}
