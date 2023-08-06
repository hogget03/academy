package by.academy.HW6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserDemo {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();

		users.add(new User("Titko", "Anton", "15"));
		users.add(new User("Kaplan", "lev", "16"));
		users.add(new User("Shpack", "Aleksandr", "17"));
		users.add(new User("Bondaryk", "Aleksandr", "19"));
		users.add(new User("Borovik", "Aleksandr", "20"));
		users.add(new User("Chepelev", "Anton", "21"));
		users.add(new User("Semashko", "Anton", "22"));
		users.add(new User("Matyas", "Anton", "23"));
		users.add(new User("Martsev", "Anton", "24"));
		users.add(new User("Gusakow", "Anton", "25"));

		File dir = new File("users");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File serializableObjectDemoFile = null;
		for (int i = 0; i < users.size(); i++) {
			try {
				serializableObjectDemoFile = new File("users",
						users.get(i).getSurname() + "_" + users.get(0).getName() + ".txt");
				if (!serializableObjectDemoFile.exists()) {
					serializableObjectDemoFile.createNewFile();
				}
				try (ObjectOutputStream os = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(serializableObjectDemoFile)))) {
					os.writeObject(users.get(i));
					os.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
