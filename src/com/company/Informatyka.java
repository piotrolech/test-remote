package com.company;

/**
 * Created by Piot on 26.12.2016.
 */
public class Informatyka {
    public static void main(String[] args) {
        char[] informatyka = new char[]{'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k', 'a'};
        char[] wspak = new char[11];
        for (int i = 0; i < informatyka.length; i++) {
            System.out.println(informatyka[i]);
        }

        System.out.print(informatyka[0] + " " + informatyka[1] + " " + informatyka[2] + " " + informatyka[3] + " " + informatyka[4] + " " + informatyka[5] + " " + informatyka[6] + " " + informatyka[7] + " " + informatyka[8] + " " + informatyka[9] + " " + informatyka[10] + " ");

        System.out.println();

        for (int i = 0; i < informatyka.length; i++) {
            System.out.print(Character.toUpperCase(informatyka[i]));
        }
        System.out.println();

        for (int i = 0; i < informatyka.length; i++) {
            System.out.print(Character.toLowerCase(informatyka[i]));
        }
        System.out.println();

        for (int i = informatyka.length-1; i >=0 ; i--) {
            System.out.print(informatyka[i]);
        }
        System.out.println();

        for (int i = 0; i < informatyka.length/2; i++) {
            char temp;
            temp = informatyka[i];
            informatyka[i] = informatyka[informatyka.length-1-i];
            informatyka[informatyka.length-1-i] = temp;
        }
        System.out.println(informatyka);

    }
}
