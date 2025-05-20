package Practice;

import java.io.File;
import java.util.Scanner;

public class readFileTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("file.txt"));
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
            if(line.isEmpty()){
                continue;
            }
        }
        scanner.close();
    }
}
