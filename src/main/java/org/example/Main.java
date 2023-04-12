package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String fileName = "src/main/resources/FactionsList.txt";

        readFromFile(fileName);
    }

    /**
     * This method is used to read the contents of the file reader line by line.
     * @param fileName The name of the file to read from.
     */
    public static void readFromFile(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName)); // br created to read line-by-line,
            String line;                                                      //the file reader is still needed for this
                while((line = br.readLine()) != null){      //while the line isn't empty: read
                    System.out.print(line + "\n");
                }
            br.close();             //Close stream
        }
        catch (Exception exception){            //Catch all exceptions
            System.out.println(exception.getMessage());
        }



    }

}