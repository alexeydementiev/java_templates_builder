package classes;

import java.time.Period;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

	protected String name;
	protected String surname;
	protected int age;
	protected String currentCity;

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		if (hasAge()) {
			System.out.println("Произведена попытка изменить возраст. Менять заданный ранее возраст можно только при помощи процедуры happyBirthday");
		} else {
			this.age = age;
		}
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public PersonBuilder newChildBuilder() {
		PersonBuilder child = new PersonBuilder().setSurname(this.surname).setAddress(this.currentCity);
		return child;
	}

	public boolean hasAge() {
		return this.age > 0 ? true : false;
	}

	public boolean hasAddress() {
		return this.currentCity == null ? false : true;
	}

	public void happyBirthday() {
		this.age++;
		System.out.println("С днем рождения! Возвраст изменен на 1 год");
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", age=" + age +
				", currentCity='" + currentCity + '\'' +
				'}';
	}

}
