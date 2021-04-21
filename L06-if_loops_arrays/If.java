package ru.otus.javabasics;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        // if
        System.out.println("=== if / if else");
        int n = 200;

        if (n > 30) {
            System.out.println("Больше 30");
        }

        // if else
        if (n > 300) {
            System.out.println("Больше 300");
        } else {
            System.out.println("Меньше 300");
        }

        // тернарный оператор :?
        System.out.println("=== тернарный оператор :?");
        int value = -5;
        int absoluteValue = value < 0 ? -value : value;
        System.out.println(absoluteValue);

        // Идентично:
//        int absoluteValue;
//        if (value < 0) absoluteValue = -value;
//        else absoluteValue = value;

        // switch


    }
}