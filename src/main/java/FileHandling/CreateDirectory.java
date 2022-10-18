package FileHandling;

import java.io.File;

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Absolute path where you want to create directory ");
        String path = sc.nextLine();
        System.out.println("Enter the directory name ");
        String directoryName = sc.nextLine();
        String pathOfNewDirectory = path + directoryName;
        File newFile = new File(pathOfNewDirectory);

        try {
            if (newFile.mkdir()) {
                Paths.get(directoryName);
                System.out.println("Created new directory as " + newFile.getAbsolutePath());
            } else {
                System.out.println("Error");
            }
        } catch (InvalidPathException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }


}
