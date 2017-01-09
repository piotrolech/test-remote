package com.company;

import static java.lang.Character.toUpperCase;

/**
 * Created by Piot on 08.01.2017.
 */
public class WitajStr {
    public static void main(String args[]) {
        String string = "Dzień dobry.";
        System.out.println(string);
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();

        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
    }
}
