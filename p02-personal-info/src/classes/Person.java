package classes;

public class Person {
	public Person(String name, int age, String email, String city, String cpf, String gender, String phone,
			String maritalStatus, String birthdate) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.city = city;
		this.cpf = cpf;
		this.gender = gender;
		this.phone = phone;
		this.maritalStatus = maritalStatus;
		this.birthdate = birthdate;
	}
	String name;
	int age;
	String email;
	String city;
	String cpf;
	String gender;
	String phone;
	String maritalStatus;
	String birthdate;
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getMaritalStatus() {
		return this.maritalStatus;
	}
	
	public String getBirthdate() {
		return this.birthdate;
	}
	
	public void printPerson() {
		System.out.println(
			"Nome: " + this.name + 
			"\nIdade: " + this.age + 
			"\nE-mail: " + this.email +
			"\nCidade: " + this.city +
			"\nCPF: " + this.cpf +
			"\nGênero: " + this.gender +
			"\nTelefone: " + this.phone +
			"\nEstado civil: " + this.maritalStatus +
			"\nData de nascimento: " + this.birthdate
		);
	}
}
