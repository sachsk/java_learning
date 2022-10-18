package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
        try {
            File newFile = new File("/Users/sachink/project/textFile.txt");
            if (newFile.createNewFile()) {
                System.out.println("File is created  at" + newFile.getAbsolutePath());
            }else {
                System.out.println("File already present");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
