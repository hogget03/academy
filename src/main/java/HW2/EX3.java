package HW2;

import java.util.Scanner;

public class EX3 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word");
		String fWord = sc.next();
		System.out.println("Enter the second word");
		String sWord = sc.next();

		sc.close();
		if (fWord.length() % 2 == 0 && sWord.length() % 2 == 0) {
			String fWordHalf = fWord.substring(fWord.length() / 2);
			String sWordHalf = sWord.substring(sWord.length() / 2);

			String result = fWordHalf + sWordHalf;
			System.out.println(result);
		} else {
			System.out.println("You entered the wrong words");
		}
	}
}
