package by.academy.lesson20;

import java.util.function.Predicate;

public class ClassEX1 {

	public static void main(String[] args) {
		Predicate<String> p = (s) -> (s != null && !s.isEmpty());
	}

}
