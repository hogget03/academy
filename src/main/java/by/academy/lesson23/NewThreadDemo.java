package by.academy.lesson23;

public class NewThreadDemo {

	public static void main(String[] args) {
		Thread t1 = new NewThread('c');
		Thread t2 = new NewThread('a');
		Thread t3 = new NewThread('b');

		t1.start();
		t2.start();
		t3.start();
	}

}
