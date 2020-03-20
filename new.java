import java.io.File;  // Import the File class
import java.io.*;  // Import the IOException class to handle errors
import java.util.Scanner;   // Import the Scanner class to read text files
import java.io.FileWriter;   // Import the FileWriter class

public class CreateFile 
{
  public static void main(String[] args) {
    long i;
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

 try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
       // System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }


try {
      FileWriter myWriter = new FileWriter("filename.txt");
      //myWriter.write("Files in Java might be tricky, but it is fun enough!");

      for (i=9999999999L; i>=6000000000L; i--) {
        myWriter.write(i+"\n");
      }

      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }



  }
}