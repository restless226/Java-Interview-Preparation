package JavaInterviewPreparation.LearnInterfaces;

interface Series {
    int MAX = 10;
    String ERRORMSG = "Cannot go to above value: " + MAX;

    int getNext();

    default void printStuff() {
        System.out.println("Live from Pune...");
    }

    static void knowAboutMe() {
        System.out.println("Hello, there. I am Series Interface. Bye.");
    }
}

interface SeriesSub extends Series {
    int getPrev();
}

class ByTwos implements SeriesSub {
    int val;

    @Override
    public int getNext() {
        if (val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 2;
        }
        return val;
    }

    @Override
    public int getPrev() {
        val -= 2;
        return val;
    }

    public void printStuff() {
        System.out.println("Inside ByTwos class");
    }
}

public class LearnInterfaces {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        SeriesSub seriesSub = null;
        System.out.println(SeriesSub.MAX);

        for (int i = 0; i < 6; i++) {
            seriesSub = byTwos;
            System.out.println("ByTwos: " + seriesSub.getNext());
        }

        byTwos.printStuff();
        Series.knowAboutMe();
    }
}