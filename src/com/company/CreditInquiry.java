package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by surverules on 2/20/2016.
 */
public class CreditInquiry {

    public static void main(String [] Args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        BigDecimal salary = BigDecimal.ZERO;
        String location = "", decision = "";
        String disconnect = "N";

        List<String> list = new ArrayList<>();
        System.out.println("Enter the Name, Salary, Location");
        System.out.println("To Terminate Enter = ?");
        System.out.println("");

        FileLayout fileLayout = null;
        //while (disconnect == "Y"){
        for ( int i = 0; i < 3; i++ ) {
            name = scanner.next();
            salary = scanner.nextBigDecimal();
            location = scanner.next();
            list.add(name + " " + salary + " " + location);
        }

        System.out.println("**** Enter following option ****");
        System.out.println("**** 1. Debit Account       ****");
        System.out.println("**** 2. Credit Account      ****");
        System.out.println("**** 3. Zero Balance        ****");

        int choice = scanner.nextInt();

        switch ( choice ) {
            case 1:
                for (String listDebit: list){
                    fileLayout = new FileLayout(listDebit);
                    if (fileLayout.getSalary().longValue() <  0){
                        System.out.println(listDebit);
                    }
                }
                break;
            case 2:
                for (String listDebit: list){
                    fileLayout = new FileLayout(listDebit);
                    if (fileLayout.getSalary().longValue() >  0){
                        System.out.println(listDebit);
                    }
                }
                break;
            case 3:
                for (String listDebit: list){
                    fileLayout = new FileLayout(listDebit);
                    if (fileLayout.getSalary().equals(BigDecimal.ZERO)){
                        System.out.println(listDebit);
                    }
                }
                break;
            default:
                break;
        }

//        for ( String listRecord : list ) {
//            System.out.println(listRecord);
//            System.out.printf("%-10s\t %f\t %s ", name, salary, location);
//        }
    }

}

