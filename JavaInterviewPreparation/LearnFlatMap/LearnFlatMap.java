package JavaInterviewPreparation.LearnFlatMap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnFlatMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B");
        List<String> list2 = Arrays.asList("C", "D");
        List<String> list3 = Arrays.asList("E", "F");

        // task: combine all three lists to form a single list

        // use case 1
        System.out.println(
                Stream.of(list1, list2, list3)
                        .flatMap(List::stream).collect(Collectors.toList()
                        ));

        // use case 2
        Map<String, List<Integer>> map = new LinkedHashMap<>();
        map.put("one", Arrays.asList(1, 2, 3));
        map.put("two", Arrays.asList(4, 5, 6));
        map.put("three", Arrays.asList(7, 8, 9));

        System.out.println(map.values().stream().flatMap(List::stream).collect(Collectors.toList()));

        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();

        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        m1.put("three", 3);
        m1.put("five", 5);
        m2.put("four", 4);
        m2.put("six", 6);

        list.add(m1);
        list.add(m2);

        System.out.println(list
                .stream()
                .map(Map::values)
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
        );

        List<Integer> arrayList = Arrays.asList(24, 43, 543, 400, 500, 101, 26);
        List<Integer> result = arrayList
                .stream()
                .filter(e -> e > 100)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
