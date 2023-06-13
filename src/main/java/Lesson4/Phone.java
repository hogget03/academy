package Lesson4;

public class Phone {
	String number;
	String model;
	double weight;

	public Phone() {
		super();

	}

	public Phone(String number, String model, double weight) {
		super();
		this.number = number;
		this.model = model;
		this.weight = weight;
	}

	public Phone(String number, String model) {
		super();
		this.number = number;
		this.model = model;

	}

	public void recieveCall(String name) {
		System.out.println("Звонит " + name);
	}

	public String getNumber() {
		return number;
	}
}
