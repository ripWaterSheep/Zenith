package Testers;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class CFGTester {
    public static void main(String[] args) throws IOException {


        String str = "File Handling in Java using " +
                " FileWriter and FileReader";

        // attach a file to FileWriter
        FileWriter fw = new FileWriter("output.txt");

        // read character wise from string and write
        // into FileWriter
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));

        System.out.println("Writing successful");
        //close the file
        fw.close();




        // pass the path to the file as a parameter
        File file =
                new File("C:\\Users\\neilm\\Documents\\intellij projects\\Zenith\\src\\Game\\Settings\\defaultSettings.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }


    }
}
