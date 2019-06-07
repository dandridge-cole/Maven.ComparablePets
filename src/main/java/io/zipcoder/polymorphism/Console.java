package io.zipcoder.polymorphism;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

//    private String userInput;

    private static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextLine();
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }

}
