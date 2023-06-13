package Lesson4;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone Phone1 = new Phone("123456", "nokia", 2.2);
		Phone Phone2 = new Phone("123567", "samsung", 3.2);
		Phone Phone3 = new Phone("123678", "redmi", 4.2);

		Phone Phone4 = new Phone("123678", "Iphone");
		Phone Phone5 = new Phone("123678", "Lenovo");

		System.out.println(Phone1.getNumber());
		System.out.println(Phone2.getNumber());
		System.out.println(Phone3.getNumber());

		Phone1.recieveCall("Коля");
		Phone2.recieveCall("Саша");
		Phone3.recieveCall("Леша");
	}

}
