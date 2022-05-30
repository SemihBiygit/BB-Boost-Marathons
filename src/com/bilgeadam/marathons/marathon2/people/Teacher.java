package com.bilgeadam.marathons.marathon2.people;

import java.time.LocalDate;

import com.bilgeadam.marathons.marathon2.superclass.Course;
import com.bilgeadam.marathons.marathon2.superclass.Employee;
import com.bilgeadam.marathons.marathon2.superclass.GenderEnum;
import com.bilgeadam.marathons.marathon2.superclass.Name;

public class Teacher extends Employee {

	protected static int numberOfTeachers = 0;

	Course course;

	public Teacher(Name name, int age, GenderEnum gender, LocalDate birthDate, String mobileNumber, boolean isMarried,
			LocalDate dateOfStart, double startingSalary) {
		super(name, age, gender, birthDate, mobileNumber, isMarried, dateOfStart, startingSalary);
		
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}



	@Override
	public void setRegistrationNumber() {

		String teacherID = String.format("%03d", ++Teacher.numberOfTeachers);
		this.setRegistrationNumber("T-" + teacherID);

	}

	@Override
	public String toString() {
		return "Teacher [course=" + this.course + ", toString()=" + super.toString() + "]";
	}

}
