package com.bilgeadam.marathons.marathon2.superclass;

import java.time.DayOfWeek;
import java.util.List;

import com.bilgeadam.marathons.marathon2.people.Student;
import com.bilgeadam.marathons.marathon2.people.Teacher;

public class Course {
	private String courseName;
	private int courseYear;
	private Teacher masterTeacher;
	private Teacher assistantTeacher;
	private int weeklyHours;
	private DayOfWeek day;
	private List<Student> studentList;

	public Course(String courseName, int courseYear, int weeklyHours, DayOfWeek day) {
		super();
		this.courseName = courseName;
		this.courseYear = courseYear;
		this.weeklyHours = weeklyHours;
		this.day = day;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseYear() {
		return this.courseYear;
	}

	public void setCourseYear(int courseYear) {
		this.courseYear = courseYear;
	}

	public Teacher getMasterTeacher() {
		return this.masterTeacher;
	}

	public void setMasterTeacher(Teacher masterTeacher) {
		this.masterTeacher = masterTeacher;
	}

	public Teacher getAssistantTeacher() {
		return this.assistantTeacher;
	}

	public void setAssistantTeacher(Teacher assistantTeacher) {
		this.assistantTeacher = assistantTeacher;
	}

	public int getWeeklyHours() {
		return this.weeklyHours;
	}

	public void setWeeklyHours(int weeklyHours) {
		this.weeklyHours = weeklyHours;
	}

	public DayOfWeek getDay() {
		return this.day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public List<Student> getStudentList() {
		return this.studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "[Course Name = " + this.courseName + ", Course Year = " + this.courseYear + ", Master Teacher = "
				+ this.masterTeacher + ", Assistant Teacher = " + this.assistantTeacher + ", Weekly Hours = "
				+ this.weeklyHours + ", Day = " + this.day + ", Student List = " + this.studentList + "]";
	}

	public String setMasterTeacher(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
