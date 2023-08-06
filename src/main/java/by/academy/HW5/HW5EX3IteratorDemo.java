package by.academy.HW5;

public class HW5EX3IteratorDemo {

	public static void main(String[] args) {
		String[][] array = { { "BMW", "Mercedes", "Audi", "Opel" }, { "Mazda", "Citroen", "Skoda", "Toyota" } };
		HW5EX3iterator<String> itetator = new HW5EX3iterator<>(array);

		while (itetator.hasNext()) {
			System.out.println(itetator.next());
		}

		System.out.println("-------------");

		Integer[][] array1 = { { 1, 2, 3, 3, 4 }, { 87, 2, 71, 23, 127, 20 } };
		HW5EX3iterator<Integer> itetator1 = new HW5EX3iterator<>(array1);

		while (itetator1.hasNext()) {
			System.out.println(itetator1.next());
		}
	}
}
