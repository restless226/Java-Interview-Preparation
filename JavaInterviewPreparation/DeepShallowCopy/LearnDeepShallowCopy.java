package JavaInterviewPreparation.DeepShallowCopy;

// copy values of one object into another
// there are three methods:
// 1. deep copy
// 2. shallow copy
// 3. object cloning

// In Shallow copy, a copy of the original object is stored
// and only the reference address is finally copied.
// In Deep copy, the copy of the original object and the repetitive copies both are stored.

public class LearnDeepShallowCopy {
    private int x;
    private int y;

    LearnDeepShallowCopy() {
    }

    LearnDeepShallowCopy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void display() {
        System.out.println("x = " + this.x + ", y = " + this.y + "\n");
    }

    private static void displayObjects(LearnDeepShallowCopy d1, LearnDeepShallowCopy d2) {
        System.out.println("Displaying d1:\n");
        d1.display();
        System.out.println("Displaying d2:\n");
        d2.display();
    }

    public static void main(String[] args) {
        LearnDeepShallowCopy copy1 = new LearnDeepShallowCopy(10, 20);
        LearnDeepShallowCopy copy2 = new LearnDeepShallowCopy();
        System.out.println("before:\n");
        copy2.display();

        // deep copy - copying copy1 into copy2
        // changes in one entity are not reflected in the other entities
        copy2.x = copy1.x;
        copy2.y = copy1.y;
        System.out.println("after:\n");
        copy2.display();

        // shallow copy - copying copy1 into copy3
        LearnDeepShallowCopy copy3 = copy1;
        copy3.display();
        System.out.println("after:\n");
        copy3.display();

        System.out.println("before:");
        displayObjects(copy1, copy3);
        copy1.x = 30;
        copy1.y = 40;
        System.out.println("after:");
        displayObjects(copy1, copy3);
    }
}