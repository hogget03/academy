package by.academy.HW6;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

public class User implements Closeable, Serializable {
	private static final long serialVersionUID = 1L;
	private String Surname;
	private String Name;
	private String Age;

	public User() {
		super();
	}

	public User(String surname, String name, String age) {
		super();
		Surname = surname;
		Name = name;
		Age = age;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String Age) {
		Age = getAge();
	}

	@Override
	public int hashCode() {
		return Objects.hash(Name, Age, Surname);
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
		return Objects.equals(Name, other.Name) && Objects.equals(Age, other.Age)
				&& Objects.equals(Surname, other.Surname);
	}

	@Override
	public String toString() {
		return "User [Surname=" + Surname + ", Name=" + Name + ", Age=" + Age + "]";
	}

	@Override
	public void close() throws IOException {
	}
}
