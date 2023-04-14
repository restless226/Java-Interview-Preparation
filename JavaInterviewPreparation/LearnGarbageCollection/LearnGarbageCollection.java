package JavaInterviewPreparation.LearnGarbageCollection;

// The finalize() method is invoked each time before the object is garbage collected.
// This method can be used to perform cleanup processing.
// This method is defined in Object class as: protected void finalize(){}

// Finalize() is the method of Object class.
// This method is called just before an object is garbage collected.
// finalize() method overrides to dispose system resources,
// perform clean-up activities and minimize memory leaks.

public class LearnGarbageCollection {
    protected void finalize() {
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        LearnGarbageCollection s1 = new LearnGarbageCollection();
        LearnGarbageCollection s2 = new LearnGarbageCollection();
        s1 = null;
        s2 = null;
        System.gc();
    }
}