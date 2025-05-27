package Lab04.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> studentArr = new ArrayList<>();
		int count = 0;
		String answer;

		do {

			System.out.println("Student #" + (count + 1));
			System.out.print("ID: ");
			int id = Integer.parseInt(scanner.nextLine());
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Age: ");
			int age = Integer.parseInt(scanner.nextLine());
			studentArr.add(new Student(id, name, age));

			count++;

			System.out.print("Do you want to add more (y/n): ");
			answer = scanner.nextLine();

		} while (answer.equalsIgnoreCase("y"));

		for (int i = 0; i < 48; i++) {
			System.out.print("=");
		}

		System.out.printf("\n| %-5s | %-10s | %-15s | %-5s |\n", "No", "ID", "Name", "Age");

		for (int i = 0; i < 48; i++) {
			System.out.print("=");
		}
		System.out.println();

		for (int i = 0; i < studentArr.size(); i++) {
			Student student = studentArr.get(i);
			System.out.printf("| %-5d | %-10d | %-15s | %-5d |\n", (i + 1), student.id, student.name, student.age);
		}

		for (int i = 0; i < 48; i++) {
			System.out.print("=");
		}

		scanner.close();

	}
}
