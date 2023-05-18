package by.academy.lesson1;

public class CatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		System.out.println(cat1);
		Cat cat2 = new Cat("Васька", "Серый", 8.0, 7);
		System.out.println(cat2);
		cat2.eat();
		System.out.println(cat2);
		cat2.walk();
		System.out.println(cat2);
		cat2.sleep();
		System.out.println(cat2);
		cat2.eat();
		System.out.println(cat2);
		cat2.walk();
		System.out.println(cat2);
	}

}
