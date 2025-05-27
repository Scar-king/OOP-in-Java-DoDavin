package Lab04.Ex4;

import java.util.Scanner;

class Video {
	String title;
	String uploader;
	double length;
	String type;

	Video(String title, String uploader, double length, String type) {
		this.title = title;
		this.uploader = uploader;
		this.length = length;
		this.type = type;
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Video[] videos = new Video[100];
		int videoCount = 0;
		int choice;

		do {
			System.out.println("=== Menu ===");
			System.out.println("1. Search");
			System.out.println("2. View all videos");
			System.out.println("3. Add a new video");
			System.out.println("4. Quit");
			System.out.print("Choose an option: ");
			choice = Integer.parseInt(scanner.nextLine());

			switch (choice) {

			case 1:
				if (videoCount == 0) {
					System.out.println("No videos available yet!");
					break;
				}

				System.out.println("==== Video Search ====");
				System.out.print("Input Uploader: ");
				String searchUploader = scanner.nextLine().toLowerCase();

				int foundCount = 0;
				for (int i = 0; i < videoCount; i++) {
					if (videos[i].uploader.toLowerCase().contains(searchUploader)) {
						if (foundCount == 0) {
							System.out.println("Videos found:");
						}
						System.out.printf("%d. %s by %s\n", (foundCount++ + 1), videos[i].title, videos[i].uploader);
					}
				}

				if (foundCount == 0) {
					System.out.println("0 video found. Try again...");
				}
				break;

			case 2:
				if (videoCount == 0) {
					System.out.println("No videos available yet!");
				} else {
					for (int i = 0; i < 75; i++) {
						System.out.print("=");
					}
					System.out.println();

					System.out.printf("| %-3s | %-20s | %-15s | %-6s | %-15s |\n", "No", "Title", "Uploader", "Length",
							"Type");

					for (int i = 0; i < 75; i++) {
						System.out.print("=");
					}
					System.out.println();

					for (int i = 0; i < videoCount; i++) {
						Video v = videos[i];
						System.out.printf("| %-3d | %-20s | %-15s | %6.2f | %-15s |\n", (i + 1), v.title, v.uploader,
								v.length, v.type);
					}

					for (int i = 0; i < 75; i++) {
						System.out.print("=");
					}
					System.out.println();
				}
				break;

			case 3:
				if (videoCount >= videos.length) {
					System.out.println("Cannot add more videos. List is full.");
					break;
				}

				System.out.println("==== Add a new video ====");
				System.out.print("Title: ");
				String title = scanner.nextLine();
				System.out.print("Uploader: ");
				String uploader = scanner.nextLine();
				System.out.print("Length (in minutes): ");
				double length = Double.parseDouble(scanner.nextLine());
				System.out.print("Type: ");
				String type = scanner.nextLine();

				videos[videoCount++] = new Video(title, uploader, length, type);
				System.out.println("The video has been added to the list successfully!");
				break;

			case 4:
				System.out.println("Thank you for using our Video Search Engine! Goodbye!");
				break;

			default:
				System.out.println("Invalid input. Please try again...");
			}

		} while (choice != 4);

		scanner.close();
	}
}


