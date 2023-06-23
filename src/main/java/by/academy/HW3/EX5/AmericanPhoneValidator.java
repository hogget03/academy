package by.academy.HW3.EX5;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
	private static final Pattern pattern = Pattern.compile("^\\+1(\\d{3})\\d{7}$");

	@Override
	public Pattern getPattern() {
		return pattern;
	}
}
