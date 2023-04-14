package JavaInterviewPreparation.MemoryLeakExample;

// memory leak is a situation when the garbage collector does not recognize the unused objects and
// they remain in the memory indefinitely that reduces the amount of memory allocated to the application.
// Because the unused objects still being referenced that may lead to OutOfMemoryError.

import java.util.Vector;

public class MemoryLeakExample {
    public static void main(String[] args) {
        Vector v1 = new Vector(314567);
        Vector v2 = new Vector(876543987);
        System.out.println("There is no memory leak in this program.");
    }
}