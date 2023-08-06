package by.academy.HW5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class HW5EX2 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		addElement(arrayList);
		addElement(linkedList);

		System.out.println("Элементы в arrayList: " + arrayList.size());
		System.out.println("Элементы в linkedList: " + linkedList.size());

		long start = System.currentTimeMillis();
		getElement(arrayList);
		long finish = System.currentTimeMillis();
		System.out.println("Время нужное на получение 100k элементов arrayList: " + (finish - start) + " mSec");

		long start1 = System.currentTimeMillis();
		getElement(linkedList);
		long finish1 = System.currentTimeMillis();
		System.out.println("Время нужное на получение 100k элементов linkedList: " + (finish1 - start1) + " mSec");

		System.out.println("Время нужное на получение 100k элементов arrayList < linkedList, "
				+ "так как в linkedList медленный доступ по индексу, а у arrayList быстрый");
	}

	public static Collection<Integer> addElement(Collection<Integer> collection) {
		Random rand = new Random();

		for (int i = 0; i < 1000000; i++) {
			collection.add(rand.nextInt(1000));
		}
		return collection;
	}

	public static void getElement(ArrayList<Integer> arrayList) {
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			arrayList.get(random.nextInt(1000000) - 1);
		}
	}

	public static void getElement(LinkedList<Integer> linkedList) {
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(random.nextInt(1000000) - 1);
		}
	}
}
