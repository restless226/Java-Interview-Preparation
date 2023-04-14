package JavaInterviewPreparation.SamplePrograms;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for int:");
        int a = scanner.nextInt();
        System.out.println("Enter value for long:");
        long b = scanner.nextLong();
        System.out.println("Enter value for string:");
        String s = scanner.nextLine();
        System.out.println(a + " " + b + " " + s);
    }
}