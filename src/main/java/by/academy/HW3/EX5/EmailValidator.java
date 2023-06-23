package by.academy.HW3.EX5;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	private static final Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

	@Override
	public Pattern getPattern() {
		return pattern;
	}
}
