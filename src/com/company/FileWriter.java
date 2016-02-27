package com.company;

        import java.io.*;

/**
 * Created by surverules on 2/20/2016.
 */
public class FileWriter {

    public static void main(String Args[]) {
        try {
            FileReader fileReader = new FileReader("D:\\Java\\Input\\Folder\\a.txt");
            java.io.FileWriter fileWriter = new java.io.FileWriter("D:\\Java\\Input\\Folder\\d.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String record = "";

            while((record = bufferedReader.readLine()) != null){
                bufferedWriter.write(record);
            }
            bufferedWriter.close();
            bufferedReader.close();

        } catch ( FileNotFoundException fileNotFoundException ) {
            fileNotFoundException.printStackTrace();
        } catch ( IOException ioexception ){
            ioexception.printStackTrace();
        }

        finally {
            System.out.println("Close the File !!");
        }
    }
}


