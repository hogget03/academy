package by.academy.lesson19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableCatDemo {

	public static void main(String[] args) {

		CloseableCat cat = new CloseableCat("jn", "hb");
		String someString = "hello there";
		int someInteger = 123;
		File serializableObjectDemoFile = null;
		try {
			serializableObjectDemoFile = new File("serializable.txt");
			if (!serializableObjectDemoFile.exists()) {
				serializableObjectDemoFile.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		try (ObjectOutputStream os = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(serializableObjectDemoFile)))) {
			os.writeObject(cat);
		} catch (IOException e) {
			System.out.println(e);
		}
		try (ObjectInputStream is = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(serializableObjectDemoFile)))) {
			System.out.println(is.readObject());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
