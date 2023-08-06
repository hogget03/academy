package by.academy.lesson21;

public class Cat {

	public String name;
	public int weight;

	public Cat(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public void Cat() {
	}

	public void sayMeow() {
		System.out.println("Мяу!");
	}

	private int steps;

	private void Steps() {

	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int weight1) {
		this.steps = steps;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", weight=" + weight + ", steps=" + steps + "]";
	}

}
