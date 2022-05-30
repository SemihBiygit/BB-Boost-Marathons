package com.bilgeadam.marathons.marathon2.superclass;

import java.time.LocalDate;

public class Person {
	private Name name;
	private int age;
	private GenderEnum gender;
	private LocalDate birthDate;
	private String mobileNumber;
	private boolean isMarried;

	public Person(Name name, int age, GenderEnum gender, LocalDate birthDate, String mobileNumber, boolean isMarried) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.birthDate = birthDate;
		this.mobileNumber = mobileNumber;
		this.isMarried = isMarried;
	}

	public boolean isMarried() {
		return this.isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Name getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public GenderEnum getGender() {
		return this.gender;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	@Override
	public String toString() {
		return "[Name = " + this.name + ", Age = " + this.age + ", Gender = " + this.gender + ", Birth Date = "
				+ this.birthDate + ", Mobile Number = " + this.mobileNumber + ", Is Married? = " + this.isMarried + "]";
	}

}
