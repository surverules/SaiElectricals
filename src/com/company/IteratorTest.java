package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by surverules on 2/25/2016.
 */
public class IteratorTest {

    public static void main(String [] Args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Sachin");
        stringList.add("Pravin");
        stringList.add("Ankita");

        System.out.println(stringList.size());

        //Iterator doing the looping
        Iterator I = stringList.iterator();
        while ( I.hasNext() ){
            System.out.println(I.next());
        }

        //ForEach from Java 8 - Looping
        stringList.forEach(list -> System.out.println(list));


        //Streams - Lamda Function
        stringList.stream()
                .filter(list -> list.contentEquals("Pravin"))
                .forEach(list -> System.out.println(list));
    }
}
