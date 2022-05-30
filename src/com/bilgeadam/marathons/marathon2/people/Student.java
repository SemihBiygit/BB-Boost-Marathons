package com.bilgeadam.marathons.marathon2.people;

import java.time.LocalDate;

import com.bilgeadam.marathons.marathon2.superclass.GenderEnum;
import com.bilgeadam.marathons.marathon2.superclass.Name;
import com.bilgeadam.marathons.marathon2.superclass.Person;

public class Student extends Person {

	protected static int numberOfStudents = 0;

	private String studentNumber;
	private LocalDate dateOfStart;
	private LocalDate dateOfFinish;
	private String parentMobileNumber;

	public Student(Name name, int age, GenderEnum gender, LocalDate birthDate, String mobileNumber,
			LocalDate dateOfStart, String parentMobileNumber) {
		super(name, age, gender, birthDate, mobileNumber, false);
		this.setStudentNumber();
		this.dateOfStart = dateOfStart;
		this.dateOfFinish = LocalDate.MAX;
		this.parentMobileNumber = parentMobileNumber;
	}

	public void setStudentNumber() {
		int year = dateOfStart.getYear();
		String studentID = String.format("%03d", ++Student.numberOfStudents);
		this.setStudentNumber(year + "-" + studentID);
	}

	public String getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
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

	public String getParentMobileNumber() {
		return this.parentMobileNumber;
	}

	public void setParentMobileNumber(String parentMobileNumber) {
		this.parentMobileNumber = parentMobileNumber;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + this.studentNumber + ", dateOfStart=" + this.dateOfStart + ", dateOfFinish="
				+ this.dateOfFinish + ", parentMobileNumber=" + this.parentMobileNumber + "]";
	}

}
