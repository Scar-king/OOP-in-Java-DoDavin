package Lab04.Ex3;

import java.util.Scanner;

class Book {
	int isbn;
	String title;
	double price;
	String author;

	Book(int isbn, String title, double price, String author) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.author = author;
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Book[] books = new Book[100];
		int bookCount = 0;
		int choice;

		do {

			System.out.println("=== Menu ===");
			System.out.println("1. View all books");
			System.out.println("2. Add a new book");
			System.out.println("3. Update a book");
			System.out.println("4. Quit");
			System.out.print("Choose an option: ");
			choice = scanner.nextInt();

			switch (choice) {

			case 1:

				if (bookCount == 0) {
					System.out.println("No books available yet!");
				} else {

					for (int i = 0; i < 57; i++) {
						System.out.print("=");
					}
					System.out.println();

					System.out.printf("| %-5s | %-18s | %-6s | %-15s |\n", "ISBN", "Title", "Price", "Author");

					for (int i = 0; i < 57; i++) {
						System.out.print("=");
					}
					System.out.println();

					for (int i = 0; i < bookCount; i++) {
						Book b = books[i];
						System.out.printf("| %-5d | %-18s | %6.2f | %-15s |\n", b.isbn, b.title, b.price, b.author);
					}

					for (int i = 0; i < 57; i++) {
						System.out.print("=");
					}
					System.out.println();
				}

				break;

			case 2:

				if (bookCount >= books.length) {
					System.out.println("Cannot add more book. List is full.");
					break;
				}

				System.out.println("=== Add a new Book ===");
				scanner.nextLine();
				System.out.print("ISBN: ");
				int isbn = Integer.parseInt(scanner.nextLine());
				System.out.print("Title: ");
				String title = scanner.nextLine();
				System.out.print("Price: ");
				double price = Double.parseDouble(scanner.nextLine());
				System.out.print("Author: ");
				String author = scanner.nextLine();

				books[bookCount++] = new Book(isbn, title, price, author);

				System.out.println("The book has been added to the list successfully!");
				break;

			case 3:

				if (bookCount == 0) {
					System.out.println("No books available to update!");
					break;
				} else {

					scanner.nextLine();
					System.out.println("=== Update a book ===");
					boolean found = false;

					while (true) {
						System.out.print("Input ISBN: ");
						int isbnAdjust = Integer.parseInt(scanner.nextLine());

						for (int i = 0; i < bookCount; i++) {
							if (books[i].isbn == isbnAdjust) {
								System.out.println("Please update the follwoing:");
								System.out.print("ISBN: ");
								int newIsbn = Integer.parseInt(scanner.nextLine());
								System.out.print("Title: ");
								String newTitle = scanner.nextLine();
								System.out.print("Price: ");
								double newPrice = Double.parseDouble(scanner.nextLine());
								System.out.print("Author: ");
								String newAuthor = scanner.nextLine();

								books[i] = new Book(newIsbn, newTitle, newPrice, newAuthor);
								System.out.println("Book updated successfully!");
								found = true;
								break;
							}
						}

						if (!found) {
							System.out.println("Book is not found. Try again...");
						} else {
							break;
						}

					}

				}
				break;

			case 4:
				System.out.println("Thank you for using our program><");
				break;

			default:
				System.out.println("Invaild input, please try again...");
				break;

			}
		} while (choice != 4);
		scanner.close();
	}

}

