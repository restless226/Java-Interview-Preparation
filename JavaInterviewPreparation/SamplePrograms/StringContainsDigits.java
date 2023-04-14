package JavaInterviewPreparation.SamplePrograms;

import java.util.Scanner;

public class StringContainsDigits {

    static boolean checkForDigits(String s) {
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of test cases: ");
        int t = scanner.nextInt();
        while (t-- > 0) {
            System.out.println("Enter string: ");
            String s = scanner.nextLine();
            System.out.println(checkForDigits(s));
        }
    }
}
