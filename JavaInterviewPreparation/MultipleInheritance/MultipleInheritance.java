package JavaInterviewPreparation.MultipleInheritance;

abstract class Animal {
    private int age = 10;
    private String name = "Animal";

    public abstract void makeNoise();

    public void printName() {
        System.out.println("inside printName name = " + name);
    }
}

interface AnimalStuff {
    static String stuff = "random animal stuff";
    public void poop();
}

class Cat extends Animal implements AnimalStuff {
    @Override
    public void makeNoise() {
        System.out.println("inside makeNoise noise is Meow");
    }

    @Override
    public void poop() {
        System.out.println("inside poop my cat is pooping");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeNoise();
        cat.poop();
        cat.printName();
        System.out.println(AnimalStuff.stuff);
    }
}
