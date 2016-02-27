package com.company;

/**
 * Created by surverules on 2/17/2016.
 */
public class StringBuilderTest {

    public static void main(String [] Args){

        StringBuilder test1 = new StringBuilder("ABC" + "CDD");

        String a = "Sachin";

        test1.replace(0,test1.length(),a);

        // Test to check the auto allocation if pimary allocation is not enough
        test1.append("  Ganesh More Bhongawali")
             .append("   Sarpanch");

        System.out.println("Test 1: " + test1 + "Capacity" +  test1.capacity() );
    }
}
