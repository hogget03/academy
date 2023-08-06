package by.academy.HW5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HW5EX4 {
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();

		getStudentMarks(marks);

		Iterator<Integer> iterator = marks.iterator();

		int max = 0;
		int temp;
		while (iterator.hasNext()) {
			temp = iterator.next();
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println("Maks mark is: " + max);

	}

	private static void getStudentMarks(List<Integer> marks) {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			marks.add(i, random.nextInt(10 + 1));

		}
		System.out.println("All marks: " + marks);
	}

}
