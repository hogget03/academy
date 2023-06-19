package Lesson5;

public class Person {
//	2.  Создать класс Person, который содержит: 
//		a) поля fullName, age. 
//		б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит". 
//		в) Добавьте два конструктора  - Person() и Person(fullName, age).
//		Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).

	protected String fullName;
	protected int age;

	public Person() {
		super();
	}

	public Person(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}

	public void move() {
		System.out.println(fullName + " двигается");
	}

	public void talk() {
		System.out.println(fullName + " что-то говорит");
	}

}
