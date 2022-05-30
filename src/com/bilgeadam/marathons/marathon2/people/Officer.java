package com.bilgeadam.marathons.marathon2.people;

import java.time.LocalDate;

import com.bilgeadam.marathons.marathon2.superclass.Employee;
import com.bilgeadam.marathons.marathon2.superclass.GenderEnum;
import com.bilgeadam.marathons.marathon2.superclass.Name;

public class Officer extends Employee {

	protected static int numberOfOfficers = 0;

	public Officer(Name name, int age, GenderEnum gender, LocalDate birthDate, String mobileNumber, boolean isMarried,
			LocalDate dateOfStart, LocalDate dateOfFinish, double startingSalary) {
		super(name, age, gender, birthDate, mobileNumber, isMarried, dateOfStart, startingSalary);
	}

	@Override
	public void setRegistrationNumber() {
		String officerID = String.format("%03d", ++Officer.numberOfOfficers);
		this.setRegistrationNumber("O-" + officerID);

	}
}
