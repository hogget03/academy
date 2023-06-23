package by.academy.HW3;

import java.util.Objects;

public class User {

	String name;
	int age;
	int manney;

	public User(String name, int age, int manney) {
		this.name = name;
		this.age = age;
		this.manney = manney;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the manney
	 */
	public int getManney() {
		return manney;
	}

	/**
	 * @param manney the manney to set
	 */
	public void setManney(int manney) {
		this.manney = manney;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, manney, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && manney == other.manney && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", manney=" + manney + "]";
	}

}