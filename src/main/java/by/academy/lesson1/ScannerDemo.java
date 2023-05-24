package by.academy.lesson1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nikname: ");
		String nikname =sc.next();
		
		System.out.println("Enter color: ");
		String color = sc.next();
		
		System.out.println("Enter weight: ");
		double weight = sc.nextDouble();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter height: ");
		double height;

		Cat cat = new Cat(nikname)
		sc.close();
	}

}
