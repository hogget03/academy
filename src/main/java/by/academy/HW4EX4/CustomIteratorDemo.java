package by.academy.HW4EX4;

public class CustomIteratorDemo {

	public static void main(String[] args) {
		String[] array = { "Hi", "Bye", "Good", "Bad" };

		CustomIterator<String> itetator = new CustomIterator<>(array);

		while (itetator.hasNext()) {
			System.out.println(itetator.next());
		}

		System.out.println();

		Integer[] array1 = { 1, 5, 5, 7, 8 };

		CustomIterator<Integer> itetator1 = new CustomIterator<>(array1);

		while (itetator1.hasNext()) {
			System.out.println(itetator1.next());
		}
	}
}
