package by.academy.lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file {
	public static void main(String[] agrs) throws IOException {

		File source = new File("test1.txt");

		File target = new File("target.txt");

		try {

			if (!source.exists()) {
				source.createNewFile();
			}
			if (!target.exists()) {
				target.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		try (FileInputStream is = new FileInputStream(source); FileOutputStream out = new FileOutputStream(target)) {
			int a;
			while ((a = is.read()) != -1) {
				out.write(a);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {

			try {
				out.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
