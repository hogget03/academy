package by.academy.HW3.EX5;

import java.util.regex.Pattern;

public interface Validator {

	default boolean isValid(String value) {
		return getPattern().matcher(value).matches();
	};

	Pattern getPattern();
}
