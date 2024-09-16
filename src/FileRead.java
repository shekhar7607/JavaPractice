// Java program to demonstrate the working
// of the FileInputStream available() method

import javax.print.attribute.standard.MediaSizeName;
import java.io.File;
import java.io.FileInputStream;

public class FileRead {

    public static void main(String[] args)
    {

        // Creating file object and specifying path
        File file = new File("C:\\Users\\swami\\OneDrive\\Desktop\\file.txt");

        try {
            FileInputStream input = new FileInputStream(file);
            int character;
            // read character by character by default
            // read() function return int between 0 and 255.

            while ((character = input.read()) != -1) {
                int ch = input.available();
                System.out.print("Currently Reading:"
                        + (char)character);
                System.out.print(" Remaining character: "
                        + ch);
                System.out.println();
            }

            input.close();
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}

