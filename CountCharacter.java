// 	Write a Java  program to count character,Words, line in a file.

import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

public final class CountCharacter{

public static void main(String[] args) throws IOException {
    //counters
    int charsCount = 0;
    int wordsCount = 0;
    int linesCount = 0;

    Scanner fileScanner = null;
    File selectedFile = null;
    JFileChooser chooser = new JFileChooser();
    // choose file 
    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        selectedFile = chooser.getSelectedFile();
        fileScanner = new Scanner(selectedFile);         
    }

    while (fileScanner.hasNextLine()) {
      linesCount++;
      String line = fileScanner.nextLine();
      Scanner lineScanner = new Scanner(line);
      // count the characters of the file till the end
      while(lineScanner.hasNext()) {
        wordsCount++;
        String word = lineScanner.next();
        charsCount += word.length();
      } 

    lineScanner.close();
  }

  //display the count of characters, words, and lines
  System.out.println("# Number of Character Of that file are : " + charsCount);
  System.out.println("# Number of Words Of that file are: " + wordsCount);
  System.out.println("# Number of Lines Of that file are: " + linesCount);
  System.out.println("# Thank You! Yousub Here");

  fileScanner.close();
 }
}