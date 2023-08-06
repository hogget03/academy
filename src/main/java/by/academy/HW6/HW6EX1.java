package by.academy.HW6;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW6EX1 {
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите слово stop, чтобы закончить запись");

		try (FileWriter fw = new FileWriter("file.txt")) {
			do {
				System.out.println("Введите текст для записи в файл: ");
				str = br.readLine();
				if (str.compareTo("stop") == 0)
					break;
				fw.write(str);
				fw.close();
			} while (str.compareTo("stop") != 0);
		} catch (IOException e) {
			System.out.println(e);
		}
		br.close();
	}
}
