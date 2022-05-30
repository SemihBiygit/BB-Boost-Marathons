package com.bilgeadam.marathons.marathon2.main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bilgeadam.marathons.marathon2.people.Officer;
import com.bilgeadam.marathons.marathon2.people.Student;
import com.bilgeadam.marathons.marathon2.people.Teacher;
import com.bilgeadam.marathons.marathon2.people.Worker;
import com.bilgeadam.marathons.marathon2.superclass.Course;
import com.bilgeadam.marathons.marathon2.superclass.Employee;
import com.bilgeadam.marathons.marathon2.superclass.GenderEnum;
import com.bilgeadam.marathons.marathon2.superclass.Name;

public class School {

	private List<Employee> employeeList;
	private HashMap<String, Course> courseList;
	private HashMap<String, Teacher> teacherList;
	private HashMap<String, Student> studentList;
	private List<Employee> oldEmployeeList = new ArrayList<>();

	public School() {
		this.employeeList = new ArrayList<>();
		this.courseList = new HashMap<>();
		this.teacherList = new HashMap<>();
		this.studentList = new HashMap<>();
	}

	public void addEmployee() {
		Teacher teacher1 = new Teacher(new Name("Tugce", "Yakup"), 24, GenderEnum.WOMAN, LocalDate.of(1997, 10, 30),
				"05001231231", false, LocalDate.of(2020, 1, 1), 10000);
		employeeList.add(teacher1);
		Teacher teacher2 = new Teacher(new Name("Semih", "Biygit"), 25, GenderEnum.MAN, LocalDate.of(1997, 1, 14),
				"05161231232", false, LocalDate.of(2020, 1, 1), 10000);
		employeeList.add(teacher2);
		Officer officer1 = new Officer(new Name("Kemal", "Yalniz"), 30, GenderEnum.MAN, LocalDate.of(1992, 5, 5),
				"05003002030", true, LocalDate.of(2019, 1, 1), null, 5000);
		employeeList.add(officer1);
		Officer officer2 = new Officer(new Name("Ayşe", "Fatma", "Hayriye"), 35, GenderEnum.WOMAN,
				LocalDate.of(1987, 1, 5), "05123121010", true, LocalDate.of(2015, 1, 1), null, 3000);
		employeeList.add(officer2);
		Worker worker1 = new Worker(new Name("Erşan", "Kuneri"), 50, GenderEnum.MAN, LocalDate.of(1972, 6, 16),
				"05311352654", false, LocalDate.of(2000, 1, 1), null, 1000);
		employeeList.add(worker1);

	}

	public void addStudent() {
		Student student1 = new Student(new Name("Ahmet", "Mehmet"), 10, GenderEnum.MAN, LocalDate.of(2012, 1, 1),
				"05321655641", LocalDate.of(2020, 9, 1), "02243461255");
		studentList.put(student1.getStudentNumber(), student1);
		Student student2 = new Student(new Name("Ayşe", "Fatma"), 10, GenderEnum.WOMAN, LocalDate.of(2012, 8, 2),
				"05321655641", LocalDate.of(2020, 9, 1), "02243235255");
		studentList.put(student2.getStudentNumber(), student2);

		Student student3 = new Student(new Name("Tugce", "Kupya"), 10, GenderEnum.WOMAN, LocalDate.of(2012, 6, 15),
				"05321655641", LocalDate.of(2020, 9, 1), "02275561255");
		studentList.put(student3.getStudentNumber(), student3);

		Student student4 = new Student(new Name("Sarp", "Yigit"), 10, GenderEnum.MAN, LocalDate.of(2012, 11, 30),
				"05321235641", LocalDate.of(2020, 9, 1), "02243543255");
		studentList.put(student4.getStudentNumber(), student4);

	}

	public void addCourse() {
		Course course1 = new Course("MATH", 2022, 4, DayOfWeek.MONDAY);
		courseList.put(course1.setMasterTeacher(employeeList.get(0)), course1);
		Course course2 = new Course("PHYSICS", 2022, 3, DayOfWeek.FRIDAY);
		courseList.put(course2.setMasterTeacher(employeeList.get(1)), course2);

	}

	public HashMap<Integer, String> initMenu() {
		HashMap<Integer, String> menu = new HashMap<Integer, String>();

		menu.put(1, "New Employee");
		menu.put(2, "Employee List");
		menu.put(3, "Old Employees");
		menu.put(4, "New Class");
		menu.put(5, "Student Assignment");
		menu.put(6, "Class List");
		menu.put(7, "Classes Attended by Students");
		menu.put(8, "Gift List");
		menu.put(9, "Salary List");
		menu.put(10, "Exit");
		return menu;
	}

	public void previousEmployeeList(List<Employee> employeeList2) {
		System.out.println("Former employee list: ");

		for (Employee employee : employeeList) {
			if (employee.getDateOfFinish().isBefore(LocalDate.now())) {
				oldEmployeeList.add(employee);
			} else {
			}

		}
		System.out.println(oldEmployeeList);

	}

	public void employeeList() {
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}

	public void salaryInfo() {
		// TODO Auto-generated method stub

	}

	public void giftRecipients() {
		// TODO Auto-generated method stub

	}

	public void studentsClasses() {
		// TODO Auto-generated method stub
	}

	public void studentList() {
		// TODO Auto-generated method stub

	}
}