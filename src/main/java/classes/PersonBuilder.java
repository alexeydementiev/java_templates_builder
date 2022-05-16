package classes;

public class PersonBuilder {

	protected String name;
	protected String surname;
	protected int age;
	protected String address;


	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public PersonBuilder setSurname(String surname) {
		this.surname = surname;
		return this;
	}

	public PersonBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public PersonBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public Person build() {

		if (name == null || name.equals("")) {
			throw new IllegalStateException("Ошибка построения объекта типа Person: не указано имя");
		}
		if (surname == null || surname.equals("")) {
			throw new IllegalStateException("Ошибка построения объекта типа Person: не указана фамилия");
		}

		if (age < 0) {
			throw new IllegalStateException("Ошибка построения объекта типа Person: недопустимый возвраст");
		}
		Person person = new Person();
		person.setName(name);
		person.setSurname(surname);
		person.setAge(age);
		person.setCurrentCity(address);
		return person;
	}
}
