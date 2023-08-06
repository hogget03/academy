package by.academy.HW4EX4;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {
	private T[] array;
	private int index;

	public CustomIterator() {
		super();
	}

	public CustomIterator(T[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (array == null || array.length <= index) {
			return false;
		}
		return array[index] != null;
	}

	@Override
	public T next() {
		return array[index++];
	}

}
