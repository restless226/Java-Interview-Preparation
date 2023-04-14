package JavaInterviewPreparation.DoubleColonOperator;

// The double colon (::) operator, also known as method reference operator in Java,
// is used to call a method by referring to it with the help of its class directly.

import java.util.*;

public class DoubleColonOperator {

    // static function to be called
    static void someFunction(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        // call the static method
        // using double colon operator
        list.forEach(DoubleColonOperator::someFunction);
    }
}