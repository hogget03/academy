package by.academy.lesson16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {
//	Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5". 
//	  Избавиться от повторяющихся элементов в строке и вывести результат на экран.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}
		sc.close();
		System.out.println(s);
	}

}
