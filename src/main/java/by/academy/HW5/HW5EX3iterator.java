package by.academy.HW5;

import java.util.Iterator;

public class HW5EX3iterator<T> implements Iterator<T> {
	private T[][] array;
	private int i;
	private int a;

	public HW5EX3iterator() {
		super();
	}

	public HW5EX3iterator(T[][] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		for (int i = this.i; i < array.length; i++) {
			for (int a = this.a; a < array[i].length;) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T next() {
		T arrayT = array[i][a];
		a++;
		for (int i = this.i; i < array.length; i++) {
			for (int a = (i == this.i ? this.a : 0); a < array[i].length;) {
				this.i = i;
				this.a = a;
				return arrayT;
			}
		}
		return arrayT;
	}
}
