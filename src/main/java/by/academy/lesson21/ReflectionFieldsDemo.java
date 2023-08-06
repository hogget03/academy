package by.academy.lesson21;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionFieldsDemo {

	public static void main(String[] args) {
		Class<Cat> catClass = Cat.class;
		Class<Tiger> tigerClass = Tiger.class;

		Field[] fieldsAll = catClass.getDeclaredFields();
		for (Field field : fieldsAll) {
			System.out.println(field);
		}
		Field[] fieldsTigerAll = tigerClass.getDeclaredFields();
		for (Field field : fieldsTigerAll) {
			System.out.println(field);
		}
		Cat cat;
		try {
			cat = catClass.getDeclaredConstructor(String.class, int.class).newInstance("Vaska", 10);
			System.out.println(cat);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

	}

}
