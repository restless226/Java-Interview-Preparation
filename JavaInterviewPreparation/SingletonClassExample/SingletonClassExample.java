package JavaInterviewPreparation.SingletonClassExample;

public class SingletonClassExample {
    private static SingletonClassExample singletonClassExample = null;

    private SingletonClassExample() {
        System.out.println("inside SingletonClassExample constructor");
    }

    public static SingletonClassExample getInstance() {
        System.out.println("inside getInstance");
        if (singletonClassExample == null) singletonClassExample = new SingletonClassExample();
        return singletonClassExample;
    }

    public static void main(String[] args) {
        SingletonClassExample singletonClassExample = new SingletonClassExample();
        System.out.println(singletonClassExample);
        singletonClassExample = SingletonClassExample.getInstance();
        System.out.println(singletonClassExample);
    }
}
