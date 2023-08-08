package by.academy.HW7;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HW7EX1 {
	public static void main(String[] args) {

		Map<Double, String> map = Stream.generate(() -> new Random().nextLong(100)).limit(100)
				.map(i -> ((i * Math.PI) - 20)).filter(i -> i < 100).sorted().skip(3).distinct()
				.collect(Collectors.toMap(value -> value, value -> (" Num: " + value)));

		System.out.println(map);
	}
}
