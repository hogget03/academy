package by.academy.lesson16;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxDemo {

	public static void main(String[] args) {
		ArrayList<HeavyBox> list = new ArrayList<HeavyBox>();
		HeavyBox box1 = new HeavyBox(5, 8, 7, 1);
		HeavyBox box2 = new HeavyBox(3, 6, 5, 8);
		HeavyBox box3 = new HeavyBox(7, 4, 5, 6);
		list.add(box1);

		list.add(box2);
		list.add(box3);

		for (HeavyBox b : list) {
			System.out.println(b);
		}
		list.get(0).setWeight(2);
		System.out.println(list.get(0));
		list.remove(list.size() - 1);
		System.out.println(list);
		HeavyBox[] array = new HeavyBox[list.size()];
		list.toArray(array);
		System.out.println(Arrays.toString(array));
		list.clear();
		System.out.println(list);
	}
}