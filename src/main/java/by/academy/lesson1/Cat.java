package by.academy.lesson1;

public class Cat {

	String nikname;
	String color;
	double weight;
	int age;
	double height;
	int money;

	public Cat() {
		super();
	}

	public Cat(String nikname, String color, double weight, int age) {
		super();
		this.nikname = nikname;
		this.color = color;
		this.weight = weight;
		this.age = age;
	}

	public void sleep() {
		System.out.println(nikname + " спит");
	}

	public void eat() {
		weight = weight + 1;
		System.out.println(nikname + " ест , вес кота теперь " + weight);
	}

	public void walk() {
		weight = weight - 1;
		System.out.println(nikname + " гуляет , теперь вес кота " + weight);
	}

	@Override
	public String toString() {
		return "nikname :" + nikname + "color :" + color + "weight :" + weight + "age :" + age;
	}
}
