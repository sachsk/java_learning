import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter the path of file");
            String path = sc.nextLine();
            File myFile = new File(path);
            Scanner fileData = new Scanner(myFile);
            System.out.println("Printing file data");
            while (fileData.hasNextLine()) {
                System.out.println(fileData.nextLine());
            }
            fileData.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error -- " + e);
        } finally {
            System.out.println("Completed fileHandling");
        }
    }
}
