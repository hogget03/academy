package by.academy.lesson23;

public class NewThread extends Thread {
	private char letter;
	
	public NewThread(char c) {
		this.letter = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread extended. Current thread: " + Thread.currentThread() + " " + "num of char: "
					+ letter + "-" + i);
		
		}
	}
}
