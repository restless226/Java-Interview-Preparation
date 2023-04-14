package JavaInterviewPreparation.LearnStringBufferBuilder;

// The String class is an immutable class whereas StringBuffer and StringBuilder classes are mutable.
// Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.
// StringBuilder is more efficient than StringBuffer.
// StringBuilder > StringBuffer > String in terms of execution
// StringBuilder is non-synchronized i.e. not thread safe.
// It means two threads can call the methods of StringBuilder simultaneously.

// StringBuilder objects are like String objects, except that they can be modified.
// Internally, these objects are treated like variable-length arrays that contain a sequence of characters.
// At any point, the length and content of the sequence can be changed through method invocations.

// A string buffer is like a String , but can be modified.
// At any point in time it contains some particular sequence of characters,
// but the length and content of the sequence can be changed through certain method calls.
// String buffers are safe for use by multiple threads.

class LearnStringBufferBuilder {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}