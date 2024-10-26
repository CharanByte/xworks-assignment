package com.xworkz.register.dto;

public class RegisterDTO {
	
	private String name;
	private String email;
	private int age;
	private String city;
	private String Country;
	
	public RegisterDTO() {
		System.out.println("running RegisterDTO no arg const");
	}

	public RegisterDTO(String name, String email, int age, String city, String country) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.city = city;
		Country = country;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return Country;
	}

	@Override
	public String toString() {
		return "RegisterDTO [name=" + name + ", email=" + email + ", age=" + age + ", city=" + city + ", Country="
				+ Country + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Country == null) ? 0 : Country.hashCode());
		result = prime * result + age;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegisterDTO other = (RegisterDTO) obj;
		if (Country == null) {
			if (other.Country != null)
				return false;
		} else if (!Country.equals(other.Country))
			return false;
		if (age != other.age)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
