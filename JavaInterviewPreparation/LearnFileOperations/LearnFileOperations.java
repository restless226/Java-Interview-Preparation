package JavaInterviewPreparation.LearnFileOperations;

import java.io.*;

public class LearnFileOperations {
    // write into file
    static void writeIntoFile() {
        System.out.println("inside writeIntoFile");
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("D:\\IdeaProjects_1-master\\src" +
                    "\\JavaInterviewPreparation\\LearnFileOperations\\final" +
                    ".txt"));
            bufferedWriter.write("hello\n");
            bufferedWriter.write("world\n");
            bufferedWriter.write("bye\n");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // read from file
    static void readFromFile() {
        System.out.println("inside readFromFile");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("D:\\IdeaProjects_1-master\\src" +
                    "\\JavaInterviewPreparation\\LearnFileOperations\\sample" +
                    ".txt"));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // copy one file content into another file
    static void copyFileIntoAnotherFile() {
        System.out.println("inside copyFileIntoAnotherFile");
        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("D:\\IdeaProjects_1-master\\src" +
                    "\\JavaInterviewPreparation\\LearnFileOperations\\sample" +
                    ".txt"));
            bufferedReader = new BufferedReader(new FileReader("D:\\IdeaProjects_1-master\\src" +
                    "\\JavaInterviewPreparation\\LearnFileOperations\\test" +
                    ".txt"));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.write(s + "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        LearnFileOperations.writeIntoFile();
        LearnFileOperations.readFromFile();
        LearnFileOperations.copyFileIntoAnotherFile();
    }
}
