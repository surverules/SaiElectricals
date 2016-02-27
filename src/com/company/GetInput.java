package com.company;

import java.util.Scanner;

/**
 * Created by surverules on 2/17/2016.
 */
public class GetInput {

    public static void main (String [] Args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  the String : " );

//        Scanner.Next ->  Just reads one String
//        Scanner.NextLine ->  Reads the whole line
        String a = scanner.nextLine();
        System.out.println(a);

        if (scanner.hasNext()){
            a  = scanner.next();
            System.out.println(a);
        }
    }
}
