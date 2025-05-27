package Lab04.Ex5;
import java.util.Scanner;

class Color {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Album[] albums = new Album[100];
        int albumCount = 0;

        while (true) {
            System.out.println("\n====== Menu ======");
            System.out.println("1. View a music store");
            System.out.println("2. Add a song");
            System.out.println("3. Create an album");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            if (option == 1) {
                System.out.println("====== Music Store ======");
                if (albumCount == 0) {
                    System.out.println(Color.RED + "No albums yet." + Color.RESET);
                } else {
                    for (int i = 0; i < albumCount; i++) {
                        System.out.println("Album: " + albums[i].title);
                        albums[i].displaySongs();
                    }
                }

            } else if (option == 2) {
                if (albumCount == 0) {
                    System.out.println(Color.RED + "No albums available. Please create one first." + Color.RESET);
                    continue; 
                }
                System.out.println("===== Add a new song =====");
                System.out.println("Select following album:");
                for (int i = 0; i < albumCount; i++) {
                    System.out.println((i + 1) + ". " + albums[i].title);
                }
                System.out.print("Choose an option: ");
                int albumChoice = scanner.nextInt();
                scanner.nextLine(); 

                if (albumChoice < 1 || albumChoice > albumCount) {
                    System.out.println(Color.RED + "Invalid album choice." + Color.RESET);
                    continue;
                }

                System.out.print("Song title: ");
                String songTitle = scanner.nextLine();

                System.out.print("Signer: ");
                String singer = scanner.nextLine();

                System.out.print("Length: ");
                int length = Integer.parseInt(scanner.nextLine().replace("mins", "").trim());

                System.out.print("Price: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); 

                Song song = new Song(songTitle, singer, length, price);
                albums[albumChoice - 1].addSong(song);
                System.out.println(Color.GREEN + "A new song added to the album" + Color.RESET);

            } else if (option == 3) {
                System.out.println("===== Create new album =====");
                System.out.print("Album title: ");
                String albumTitle = scanner.nextLine();

                System.out.print("Genre: ");
                String genre = scanner.nextLine();

                albums[albumCount++] = new Album(albumTitle, genre);
                System.out.println(Color.GREEN + "Album Created Successfully!" + Color.RESET);
            } else if (option == 4) {
                System.out.println("Thank you. Goodbye!");
                break;
            } else {
                System.out.println(Color.RED + "Invalid option." + Color.RESET);
            }
        }

        scanner.close();
    }
}
