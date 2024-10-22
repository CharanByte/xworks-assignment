package com.xworkz.form.dto;

import java.io.Serializable;

public class CollegeAdmissionDTO implements Serializable {
	
	private String name;
	private String email;
	private Long mobile ;
	private String address;
	private String fatherName;
	private String motherName;
	private double percentage;
	private String course;
	private int age;
	
	public CollegeAdmissionDTO() {
		super();
	}

	public CollegeAdmissionDTO(String name, String email, Long mobile, String address, String fatherName,
			String motherName, double percentage, String course, int age) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.percentage = percentage;
		this.course = course;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Long getMobile() {
		return mobile;
	}

	public String getAddress() {
		return address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getCourse() {
		return course;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "CollegeAdmissionDTO [name=" + name + ", email=" + email + ", mobile=" + mobile + ", address=" + address
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", percentage=" + percentage
				+ ", course=" + course + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((motherName == null) ? 0 : motherName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(percentage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CollegeAdmissionDTO other = (CollegeAdmissionDTO) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (motherName == null) {
			if (other.motherName != null)
				return false;
		} else if (!motherName.equals(other.motherName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(percentage) != Double.doubleToLongBits(other.percentage))
			return false;
		return true;
	}
	
	
	
	
	
	

}
