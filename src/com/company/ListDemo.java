package com.company;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by surverules on 2/23/2016.
 */
public class ListDemo {

    public static void main(String [] Args){

        List<String> listString =  new ArrayList<String>();

        listString.add("A");
        listString.add("B");
        listString.add("B");
        listString.add("D");

        Iterator listIterator = listString.listIterator();

        listString.forEach(list -> System.out.println(list));

        listString.stream()
                .filter(s -> s.contentEquals("B"))
                .forEach(s -> System.out.println(s));
    }

}
