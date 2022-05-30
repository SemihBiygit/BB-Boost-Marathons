package com.bilgeadam.marathons.marathon2.main;

import java.util.Scanner;

public class SchoolInformationSystem {
	public static void main(String[] args) {
		School school = new School();
		boolean exit = false;
		int i;

		while (!exit) {

			System.out.println("Choose an action");
			Scanner scanner = new Scanner(System.in);
			i = scanner.nextInt();

			scanner.nextLine();
			switch (i) {
			case 1:
				school.addEmployee();
				break;
			case 2:
				school.employeeList();
				break;
			case 3:
				school.previousEmployeeList(null);
				break;
			case 4:
				school.addCourse();
				break;
			case 5:
				school.addStudent();
				;
				break;
			case 6:
				school.studentList();
				break;
			case 7:
				school.studentsClasses();
				break;
			case 8:
				school.giftRecipients();
				break;
			case 9:
				school.salaryInfo();
				break;
			case 10:
				exit = true ;
				System.out.println("Exitting...");
				break;
			}
		}
	}
}
