package com.bilgeadam.marathons.marathon2.people;

import java.time.LocalDate;

import com.bilgeadam.marathons.marathon2.superclass.Employee;
import com.bilgeadam.marathons.marathon2.superclass.GenderEnum;
import com.bilgeadam.marathons.marathon2.superclass.Name;

public class Worker extends Employee {

	protected static int numberOfWorkers = 0;

	public Worker(Name name, int age, GenderEnum gender, LocalDate birthDate, String mobileNumber, boolean isMarried,
			LocalDate dateOfStart, LocalDate dateOfFinish, double startingSalary) {
		super(name, age, gender, birthDate, mobileNumber, isMarried, dateOfStart, startingSalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setRegistrationNumber() {
		String workerID = String.format("%03d", ++Worker.numberOfWorkers);
		this.setRegistrationNumber("W-" + workerID);
	}

}
