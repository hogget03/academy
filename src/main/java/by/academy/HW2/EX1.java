package by.academy.HW2;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		if (s1.length() != s2.length()) {
			System.out.println(false);
			return;
		}
		int[] counters = new int[128];

		for (int i = 0; i < s1.length(); i++) {
			counters[s1.charAt(i)]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			counters[s2.charAt(i)]--;
		}
		boolean isOk = true;
		for (int i : counters) {
			if (i != 0) {
				isOk = false;
				break;
			}
		}
		System.out.println(isOk);
	}

}
