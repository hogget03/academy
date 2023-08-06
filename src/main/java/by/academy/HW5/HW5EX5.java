package by.academy.HW5;

import java.util.HashMap;
import java.util.Map;

public class HW5EX5 {

	public static void main(String[] args) {
		String string = new String(
				"BMW X5M the best car for the family, but at the same time for fun, if you know what I'm talking about)");

		string = string.toLowerCase();

		Map<Character, Integer> dictionaryMap = new HashMap<>();
		char[] chars = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			int a = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] != '\u0000' && chars[i] == chars[j]) {
					a++;
					chars[j] = '\u0000';

				}
			}
			if (chars[i] != '\u0000') {
				dictionaryMap.put(chars[i], a);

			}
		}
		System.out.println(dictionaryMap);
	}
}
