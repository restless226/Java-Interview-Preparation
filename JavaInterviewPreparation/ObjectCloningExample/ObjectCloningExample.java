package JavaInterviewPreparation.ObjectCloningExample;

// suppressing unnecessary Exception using Cloneable
public class ObjectCloningExample implements Cloneable {

    private int x;
    private int y;

    ObjectCloningExample() {
    }

    ObjectCloningExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // suppressing unnecessary Exception using Cloneable
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private void display() {
        System.out.println("x = " + this.x + ", y = " + this.y + "\n");
    }

    private static void displayObjects(ObjectCloningExample d1, ObjectCloningExample d2) {
        System.out.println("Displaying d1:\n");
        d1.display();
        System.out.println("Displaying d2:\n");
        d2.display();
    }

    // suppressing unnecessary Exception using Cloneable
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloningExample obj1 = new ObjectCloningExample(10, 20);
        ObjectCloningExample obj2 = (ObjectCloningExample) obj1.clone();
        obj2.display();
    }
}