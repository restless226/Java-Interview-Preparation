package JavaInterviewPreparation.LearnThrowsException;

// Java program to demonstrate working of throws
// The throws keyword is used to declare which exceptions can be thrown from a method,
// while the throw keyword is used to explicitly throw an exception within a method or block of code.

public class LearnThrowsException {

    // This method throws an exception
    // to be handled
    // by caller or caller
    // of caller and so on.
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun().");
        throw new IllegalAccessException("demo");
    }

    // This is a caller function
    public static void main(String[] args) {
        try {
            fun();
        } catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}