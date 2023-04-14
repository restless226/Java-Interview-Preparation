package JavaInterviewPreparation.LearnCoupling;

// Java program to illustrate tight coupling concept using "Inheritance"
class SubjectTight {
    TopicTight t = new TopicTight();

    public void startReading() {
        t.understand();
    }
}

class TopicTight extends SubjectTight {
    public void understand() {
        System.out.println("Tight coupling concept");
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        SubjectTight t = new TopicTight();
    }
}

// Explanation: In the above program the Subject class is dependents on Topic class.
// In the above program Subject class is tightly coupled with Topic class
// it means if any change in the Topic class requires Subject class to change.
// For example, if Topic class understand() method change to gotit() method
// then you have to change the startReading() method will call gotit() method
// instead of calling understand() method

// Link: https://www.geeksforgeeks.org/coupling-in-java/