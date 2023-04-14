package JavaInterviewPreparation.Collections;

import java.util.*;

class LearnArrayList {
    static void showArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Rohit");

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        list.set(2, 2000);

        System.out.println(list.contains(500));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is: " + list.get(i));
        }

        for (Integer element : list) {
            System.out.println("foreach the element is: " + element);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("iterator: " + iterator.next());
        }

        List<Student> students = new ArrayList<>();
        System.out.println(students);
        students.add(new Student("Rohit", 5));
        students.add(new Student("Rahul", 5));
        students.add(new Student("Abhijeet", 10));
        students.add(new Student("Harshal", 3));
        Collections.sort(students);
        System.out.println(students);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(students);
    }
}

class LearnStack {
    static void showStack() {
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("horse");
        animals.push("cat");
        animals.push("rabbit");
        System.out.println("Stack: " + animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
    }
}

class LearnLinkedListAndQueue {
    static void showLinkedListAndQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}

class LearnPriorityQueue {
    static void showLearnPriorityQueue() {
        System.out.println("********************MINHEAP********************");
        PriorityQueue<Integer> minheap = new PriorityQueue<>();  // minheap
        minheap.offer(40);
        minheap.offer(12);
        minheap.offer(24);
        minheap.offer(36);
        System.out.println(minheap);
        System.out.println(minheap.poll());
        System.out.println(minheap);
        System.out.println(minheap.peek());

        System.out.println("********************MAXHEAP********************");
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());  // minheap
        maxheap.offer(40);
        maxheap.offer(12);
        maxheap.offer(24);
        maxheap.offer(36);
        System.out.println(maxheap);
        System.out.println(maxheap.poll());
        System.out.println(maxheap);
        System.out.println(maxheap.peek());
    }
}

class LearnArrayDeque {
    static void showLearnArrayDeque() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(12);   // adds element in tail
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(24);  // adds element to head
        System.out.println(arrayDeque);
        arrayDeque.offerLast(36);  // adds element to tail
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);
    }
}

class LearnSet {
    static void showSet() {
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(64);
        set.add(16);
        set.add(80);
        set.add(96);
        System.out.println(set);
        System.out.println(set.contains(80));
        System.out.println(set.contains(20));
        set.remove(80);
        System.out.println(set);
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}

class LearnLinkedHashset {
    // Linked List + Hashset
    static void showLearnLinkedHashset() {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(32);
        set.add(64);
        set.add(16);
        set.add(80);
        set.add(96);
        System.out.println(set);
        System.out.println(set.contains(80));
        System.out.println(set.contains(20));
        set.remove(80);
        System.out.println(set);
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}

class LearnTreeSet {
    // Applies properties for both set + BST (sorting)
    static void showTreeSet() {
        Set<Integer> set = new TreeSet<>();
        set.add(32);
        set.add(64);
        set.add(16);
        set.add(80);
        set.add(96);
        System.out.println(set);
        System.out.println(set.contains(80));
        System.out.println(set.contains(20));
        set.remove(80);
        System.out.println(set);
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}

class Student implements Comparable<Student> {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
}

class LearnCustomSet {
    static void showCustomSet() {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student("Rohit", 5));
        students.add(new Student("Rahul", 5));
        students.add(new Student("Abhijeet", 10));
        students.add(new Student("Harshal", 3));
        System.out.println(students);
        Student s1 = new Student("Harshal", 4);
        Student s2 = new Student("Rohit", 4);
        System.out.println(s1.equals(s2));
    }
}

class LearnHashMap {
    static void showHashMap() {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        System.out.println(numbers);
        if (numbers.containsKey("two")) {
            numbers.put("two", 23);
        }
        numbers.putIfAbsent("two", 23);
        System.out.println(numbers);

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey() + " => " + e.getValue());
        }
        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());
        numbers.remove("three");
        System.out.println(numbers);
    }
}

class LearnTreeMap {
    static void showTreeMap() {
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        System.out.println(numbers);
        if (numbers.containsKey("two")) {
            numbers.put("two", 23);
        }
        numbers.putIfAbsent("two", 23);
        System.out.println(numbers);

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey() + " => " + e.getValue());
        }
        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());
        numbers.remove("three");
        System.out.println(numbers);
    }
}

class LearnArrays {
    static void showArrays() {
        Integer[] numbers = {12, 345, 65, 7, 6, 8, 4, 35, 3, 5, 32, 4, 335, 34};
        Arrays.sort(numbers);
        for (int e : numbers) {
            System.out.println(e + " ");
        }
        Arrays.fill(numbers, 12);
        for (int e : numbers) {
            System.out.println(e + " ");
        }
    }
}

class VerifyCollections {
    static void showCollections() {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(23);
        list.add(54);
        list.add(3);
        list.add(3);
        list.add(56);
        list.add(56);
        System.out.println(list);
        System.out.println("min element: " + Collections.min(list));
        System.out.println("max element: " + Collections.max(list));
        System.out.println("max element: " + Collections.frequency(list, 9));
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}

class LearnCollections {
    public static void main(String[] args) {
        System.out.println("********************ARRAYLIST********************");
        LearnArrayList.showArrayList();
        System.out.println("********************STACK********************");
        LearnStack.showStack();
        System.out.println("********************LINKED-LIST-AND-QUEUE********************");
        LearnLinkedListAndQueue.showLinkedListAndQueue();
        System.out.println("********************PRIORITY-QUEUE********************");
        LearnPriorityQueue.showLearnPriorityQueue();
        System.out.println("********************ARRAY_DEQUE********************");
        LearnArrayDeque.showLearnArrayDeque();
        System.out.println("********************HASHSET********************");
        LearnSet.showSet();
        System.out.println("********************LINKED-HASHSET********************");
        LearnLinkedHashset.showLearnLinkedHashset();
        System.out.println("********************TREE-SET********************");
        LearnTreeSet.showTreeSet();
        System.out.println("********************CUSTOM-HASHSET********************");
        LearnCustomSet.showCustomSet();
        System.out.println("********************HASHMAP********************");
        LearnHashMap.showHashMap();
        System.out.println("********************TREEMAP********************");
        LearnTreeMap.showTreeMap();
        System.out.println("********************ARRAYS********************");
        LearnArrays.showArrays();
        System.out.println("********************COLLECTIONS********************");
        VerifyCollections.showCollections();
    }
}