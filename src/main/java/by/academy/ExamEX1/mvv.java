package by.academy.ExamEX1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mvv {
	public static void main(String... agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значиение ");
		String str = sc.next();
		System.out.println(Arrays.stream(str.trim().split("(?<=(.))(?!\\1)"))
				.map(x -> x.length() > 1 ? String.format("%d%c", x.length(), x.charAt(0)) : x)
				.collect(Collectors.joining()));
		sc.close();
	}
}
