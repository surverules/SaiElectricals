package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by surverules on 2/19/2016.
 */
public class FolderRead {

    public static void main(String [] Args){


//      code to read the text file.
        try {
            FileReader fileReader = new FileReader("D:\\Java\\Input\\Folder\\a.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String record = null;
            while ((record = bufferedReader.readLine()) != null ){
                System.out.println(record);
            }

        } catch (Exception FileNotFoundException) {
            FileNotFoundException.printStackTrace();
        }

//      code to read a folder
        final File file  = new File("D:\\Java\\Input\\Folder");
        BufferedReader bufferedReader = null;
        FileReader fileFolder = null;
        String records = "";
        char [] find = null;
        int i = 0, a = 0;
        for (File file1: file.listFiles()) {

            try {
                fileFolder = new FileReader(file1);
                bufferedReader = new BufferedReader(fileFolder);
                while ( (records = bufferedReader.readLine()) != null ) {
                    if (records.contains("Surve")){
                        a = records.indexOf("Surve");
                        String before = records.substring(0, a).trim();
                        find = before.toCharArray();
                        for (i = before.length(); i > 0 ; i--){
                            if (Character.toString(find[i-1]).equalsIgnoreCase(" ")){
                                break;
                            }
                        }
                    }
                    System.out.println("Name: " + records.substring( i, a));
                }
            } catch ( Exception exception ) {
                exception.printStackTrace();
            }
        }
    }
}
