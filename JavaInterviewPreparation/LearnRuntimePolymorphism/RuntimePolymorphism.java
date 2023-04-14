package JavaInterviewPreparation.LearnRuntimePolymorphism;

// Since method invRocation is determined by the JVM not compiler,
// it is known as runtime polymorphism.
class A {
    A() {
        System.out.println("inside constructor A");
    }

    protected void displayA() {
        System.out.println("inside displayA");
    }
}

class B extends A {
    B() {
        System.out.println("inside constructor B");
    }

    protected void displayB() {
        System.out.println("inside displayB");
    }
}

class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // If the reference variable of Parent class
        // refers to the object of Child class, it is known as upcasting.
        A a = new B();  // upcasting
        a.displayA();

        Bike b = new Splendor();    // upcasting
        b.run();
    }
}

