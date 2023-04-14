package JavaInterviewPreparation.FactoryDesignPatterns;

// A Factory Pattern or Factory Method Pattern says that
// just define an interface or abstract class
// for creating an object but let the subclasses decide which class to instantiate.

public class LearnFactoryDesignPatterns {
    public static void main(String[] args) {

        // factory object
        OSFactory _osFactory = new OSFactory();

        OS android = _osFactory.getInstance("Open");
        OS ios = _osFactory.getInstance("Closed");
        OS windows = _osFactory.getInstance("anything");

        android.spec();
        ios.spec();
        windows.spec();
    }
}