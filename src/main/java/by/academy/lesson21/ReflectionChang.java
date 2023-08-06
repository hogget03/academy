package by.academy.lesson21;

import java.lang.reflect.Method;

public class ReflectionChang {

	public static void main(String[] args) {

		Cat cat = new Cat("Vasya", "10");
		Class<Cat> catClass = Cat.class;
		
		Method getWeightMethod;
		try {
			getWeightMethod = catClass.getMethod("getWeight");
			Object resultValue = getWeightMethod.invoke(cat);
			System.out.println(resultValue);
			Method setWeightMethod = catClass.getDeclaredMethod("setWeight", int.class);
			setWeightMethod.setAccessible(true);
			System.out.println("Before Change: " + );
		}
	}

}
