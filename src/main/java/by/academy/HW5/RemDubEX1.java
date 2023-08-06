package by.academy.HW5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class RemDubEX1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("BMW");
		arrayList.add("Audi");
		arrayList.add("Mercedes");
		arrayList.add("BMW");
		arrayList.add("Audi");
		arrayList.add("Opel");

		System.out.println(arrayList);

		System.out.println(removeDublicates(arrayList));

		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		arrayList1.add(2);
		arrayList1.add(9);
		arrayList1.add(9);

		System.out.println(arrayList1);

		System.out.println(removeDublicates(arrayList1));
	}

	public static <T> Collection<T> removeDublicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}
}
