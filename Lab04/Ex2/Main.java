package Lab04.Ex2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[100];
		int studentCount = 0;
		boolean processing = true;

		while (processing) {
			System.out.println("==== Menu ====");
			System.out.println("1. View all students");
			System.out.println("2. Add a new student");
			System.out.println("3. Delete a student");
			System.out.println("4. Quit");
			System.out.print("Choose an option: ");
			int option = Integer.parseInt(scanner.nextLine());

			switch (option) {
			case 1:
				for (int i = 0; i < 48; i++) {
					System.out.print("=");
				}

				System.out.printf("\n| %-5s | %-10s | %-15s | %-5s |\n", "No", "ID", "Name", "Age");

				for (int i = 0; i < 48; i++) {
					System.out.print("=");
				}
				System.out.println();

				for (int i = 0; i < studentCount; i++) {
					Student student = students[i];
					System.out.printf("| %-5d | %-10d | %-15s | %-5d |\n", (i + 1), student.id, student.name,
							student.age);
				}

				for (int i = 0; i < 48; i++) {
					System.out.print("=");
				}
				System.out.println();
				break;

			case 2:
				if (studentCount >= students.length) {
					System.out.println("Cannot add more students. List is full.");
					break;
				}

				System.out.println("==== Add a new student ====");
				System.out.print("ID: ");
				int id = Integer.parseInt(scanner.nextLine());

				System.out.print("Name: ");
				String name = scanner.nextLine();

				System.out.print("Age: ");
				int age = Integer.parseInt(scanner.nextLine());

				students[studentCount++] = new Student(id, name, age);
				System.out.println("Student added successfully.");
				break;

			case 3:
				if(studentCount == 0) {
					System.out.println("There are no students in the list yet!");
					break;
				} else {
					System.out.println("==== Delete a student ====");
					while (true) {
						System.out.print("Input student ID: ");
						int deleteId = Integer.parseInt(scanner.nextLine());
						boolean found = false;
						
						for (int i = 0; i < studentCount; i++) {
							if (students[i].id == deleteId) {
								
								System.out.println("The following student has been deleted:");
								
								for (int j = 0; j < 48; j++) {
									System.out.print("=");
								}
								System.out.println();
								
								System.out.printf("| %-5d | %-10d | %-15s | %-5d |\n", (i + 1), students[i].id,
										students[i].name, students[i].age);
								
								for (int j = 0; j < 48; j++) {
									System.out.print("=");
								}
								System.out.println();
								
								for (int j = i; j < studentCount - 1; j++) {
									students[j] = students[j + 1];
								}
								students[studentCount--] = null;
								found = true;
								break;
							}
						}
						
						if (!found) {
							System.out.println("Student is not found. Try again.");
						} else {
							break;
						}
					}
					break;
				}

			case 4:
				processing = false;
				System.out.println("Thank you for using our program><");
				break;

			default:
				System.out.println("Invalid option. Please try again...");
			}
		}

		scanner.close();
	}
}

