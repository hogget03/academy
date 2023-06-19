package Lesson5;

public class PersonDemo {
	public static void main(String... strings) {
		Person a = new Person();
		Person b = new Person("Вася", 22);

		a.move();
		b.move();
		a.talk();
		b.talk();
	}
}
