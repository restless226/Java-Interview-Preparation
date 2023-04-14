package JavaInterviewPreparation.ParallelStreamTest;

// Java Program to Illustrate Parallel Streams
// Using parallel() method on a Stream

// Importing required classes

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

// Main class
// ParallelStreamTest
public class ParallelStreamTest {

    // Main driver method
    public static void main(String[] args) throws IOException {

        // Creating a File object
        File fileName = new File("D:\\IdeaProjects_1-master\\src\\JavaInterviewPreparation\\ParallelStreamTest\\test" +
                ".txt");

        // Create a Stream of string type
        // using the lines() method to
        // read one line at a time from the text file
        Stream<String> text = Files.lines(fileName.toPath());

        // Creating parallel streams using parallel() method
        // later using forEach() to print on console
        text.parallel().forEach(System.out::println);

        // Closing the Stream
        // using close() method
        text.close();
    }
}