package Practice;

import java.io.PrintWriter;

public class FileTest {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter("file.txt");
        writer.println("Hello, World!");
        writer.print("Name: ");
        writer.println("Do Davin");
        writer.close();
    }
}
