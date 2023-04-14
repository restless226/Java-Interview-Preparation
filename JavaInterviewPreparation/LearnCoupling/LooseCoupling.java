package JavaInterviewPreparation.LearnCoupling;

// Java program to illustrate loose coupling concept using "Interface"
interface Topic {
    void understand();
}

class Topic1 implements Topic {
    public void understand() {
        System.out.println("Got it");
    }
}

class Topic2 implements Topic {
    public void understand() {
        System.out.println("understand");
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        Topic t = new Topic1();
        t.understand();
    }
}

// Explanation : In the above example, Topic1 and Topic2 objects are loosely coupled using Topic interface.
// Any changes made in Topic1 will not affect working of Topic2.
// It means Topic is an interface and we can inject any of the implemented classes at run time
// and we can provide service to the end user.

// Link: https://www.geeksforgeeks.org/coupling-in-java/