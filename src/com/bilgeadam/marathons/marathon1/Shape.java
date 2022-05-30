package com.bilgeadam.marathons.marathon1;

import java.util.Scanner;

public class Shape {
	int perimeter;
	int area;

	public void readInput() {
		Scanner scanner = new Scanner(System.in);
		int i = 1;

		do {

			System.out.println(
					"Please enter the side lengths of the shape (maximum 4 sides) you want to calculate. (-1 Exit)");

			System.out.println("Please enter the 1st side length. (end with 0): ");
			int edge1 = scanner.nextInt();
			if (edge1 == -1) {
				return;
			} else if (edge1 == 0) {
				System.err.println("It cannot be a none-sided quadrilateral!");
				System.exit(edge1);
			}

			else {

				System.out.println("Please enter the 2nd side length. (end with 0): ");
				int edge2 = scanner.nextInt();
				if (edge2 == 0) {
					System.err.println("It cannot be a one-sided quadrilateral!");
					System.exit(edge2);
				}

				System.out.println("Please enter the 3rd side length. (end with 0): ");
				int edge3 = scanner.nextInt();
				if (edge3 == 0) {
					System.err.println("It cannot be a two-sided quadrilateral!");
					System.exit(edge3);
				}

				System.out.println("Please enter the 4th side length. (end with 0): ");
				int edge4 = scanner.nextInt();

				perimeter = edge1 + edge2 + edge3 + edge4;
				area = edge1 * edge2;
				System.out.println(i + "." + "Perimeter is: " + perimeter);
				System.out.println(i + "." + "Area is: " + area);

			}
			i = i + 1;
		} while (true);
	}
}
