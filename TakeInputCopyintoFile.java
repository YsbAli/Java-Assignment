//Write a java program to take input from keyboard and write them in a file.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TakeInputCopyintoFile {
    public static void main(String[] args) {
        try {
            // Create a FileWriter object to write to the file
            FileWriter fileWriter = new FileWriter("output.txt");

            // Create a BufferedWriter object to write text to the FileWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Scanner scanner = new Scanner(System.in);
            String line;

            System.out.println("Enter text You Want to Write in Text File(type 'exit' to quit):");

            // Read input from the keyboard until 'exit' is entered
            while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                // Write the input line to the file
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a newline after each line
            }

            // Close the BufferedWriter
            bufferedWriter.close();

            System.out.println("Input written to file.");

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}






