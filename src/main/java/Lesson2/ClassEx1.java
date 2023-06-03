package Lesson2;

public class ClassEx1 {

	public static void main(String[] args) {
		printLastChar("I like Java!!!");
		endWithSigh("I like Java!!!");
		startOnChar("I like Java!!!");
		check1("I like Java!!!");
		check2("I like Java!!!");
		check3("I like Java!!!");
		up("I like Java!!!");
		down("I like Java!!!");
		cutOf("I like Java!!!");
	}

	public static void cutOf(String s) {
		System.out.println(s.substring(1, s.length() - 2));
	}

	public static void down(String s) {
		System.out.println(s.toLowerCase());
	}

	public static void up(String s) {
		System.out.println(s.toUpperCase());
	}

	public static void check3(String s) {
		System.out.println(s.replace("a", "o"));
	}

	public static void check2(String s) {
		System.out.println(s.indexOf("Java"));
	}

	public static void check1(String s) {
		System.out.println(s.contains("Java"));
	}

	public static void startOnChar(String s) {
		System.out.println(s.startsWith("I like"));
	}

	public static void endWithSigh(String s) {
		System.out.println(s.endsWith("!!!"));
	}

	public static void printLastChar(String s) {
		System.out.println(s.charAt(s.length() - 1));
	}
}
//a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”. 
//б) Распечатать последний символ строки. Используем метод String.charAt().
//в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith(). 
//д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
//ж) Заменить все символы “а” на “о”. 
//з) Преобразуйте строку к верхнему регистру.
//и) Преобразуйте строку к нижнему регистру.
//к) Вырезать строку Java c помощью метода String.substring()