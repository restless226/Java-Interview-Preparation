package JavaInterviewPreparation.FunctionalInterfaceExample;

// An Interface that contains exactly one abstract method is known as functional interface.
// It can have any number of default, static methods but can contain only one abstract method.
// Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
// It is a new feature in Java, which helps to achieve functional programming approach.

@FunctionalInterface
interface Sayable {
    void say(String msg);

    default public void randomStuff() {
        System.out.println("inside randomStuff");
    }
}

public class FunctionalInterfaceExample implements Sayable {
    public void say(String msg) {
        System.out.println(msg);
    }

    // overriding default method in java
    public void randomStuff() {
        System.out.println("inside randomStuff in FunctionalInterfaceExample");
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello there");
    }
}