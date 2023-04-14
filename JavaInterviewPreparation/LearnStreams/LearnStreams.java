package JavaInterviewPreparation.LearnStreams;

import java.util.*;
import java.util.stream.Collectors;

class Founder {
    String name;
    int money;

    Founder(String name, int money) {
        this.name = name;
        this.money = money;
    }
}

public class LearnStreams {
    public static void main(String[] args) {
        List<Founder> foundersList = new ArrayList<>();

        foundersList.add(new Founder("Warren Buffett", 120));
        foundersList.add(new Founder("Jeff Bezos", 150));
        foundersList.add(new Founder("Bill Gates", 100));
        foundersList.add(new Founder("Mark Zukerberg", 50));
        foundersList.add(new Founder("Elon Musk", 200));

        List<Founder> billionaresList = foundersList
                .stream()
                .filter(founder -> founder.money >= 100)
                .sorted(Comparator.comparing(founder -> founder.name))
                .collect(Collectors.toList());

        billionaresList.forEach(founder -> System.out.println(founder.name));
    }
}
