package com.bilgeadam.marathons.marathon2.superclass;

import java.time.LocalDate;

public abstract class Employee extends Person {

	private String registrationNumber;
	private LocalDate dateOfStart;
	private LocalDate dateOfFinish;
	private double startingSalary;

	public Employee(Name name, int age, GenderEnum gender, LocalDate birthDate, String mobileNumber, boolean isMarried,
			LocalDate dateOfStart, double startingSalary) {
		super(name, age, gender, birthDate, mobileNumber, isMarried);
		this.dateOfStart = dateOfStart;
		this.dateOfFinish = LocalDate.MAX;
		this.startingSalary = startingSalary;
	}

	public abstract void setRegistrationNumber();

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public LocalDate getDateOfStart() {
		return this.dateOfStart;
	}

	public void setDateOfStart(LocalDate dateOfStart) {
		this.dateOfStart = dateOfStart;
	}

	public LocalDate getDateOfFinish() {
		return this.dateOfFinish;
	}

	public void setDateOfFinish(LocalDate dateOfFinish) {
		this.dateOfFinish = dateOfFinish;
	}

	public double getStartingSalary() {
		return this.startingSalary;
	}

	public void setStartingSalary(double startingSalary) {
		this.startingSalary = startingSalary;
	}

	@Override
	public String toString() {
		return "Employee [RegistrationNumber=" + this.registrationNumber + ", dateOfStart=" + this.dateOfStart
				+ ", dateOfFinish=" + this.dateOfFinish + ", startingSalary=" + this.startingSalary + "]";
	}

}