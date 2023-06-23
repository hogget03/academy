package by.academy.HW3.EX3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX3Time2 {
	static Pattern pattern = Pattern.compile("^(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-(([12])\\d\\d\\d)$");

	public static void main(String[] args) {
		System.out.println(match("12-02-2023"));
		System.out.println(match("12/02/2099"));
		System.out.println(match("12/02/1258"));
	}

	public static boolean match(String testString) {
		Matcher matcher = pattern.matcher(testString);
		return matcher.matches();
	}
}
