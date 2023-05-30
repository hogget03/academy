package by.academy.HW;

public class Ex4 {

	public static void main(String[] args) {

		int i = 1;
		int result = 2;
		while (result < 1000000) {
			result *= 2;
			i++;
			System.out.println(result);
			System.out.println(i);
		}

	}

}
