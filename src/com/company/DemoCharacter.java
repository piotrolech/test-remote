package com.company;

import static java.lang.System.out;

/**
 * Created by Piot on 26.12.2016.
 */
public class DemoCharacter {
    public static void main(String args[]) {
 /* Informacje o metodzie */
        out.println("Klasa: java.lang.Character");
        out.println("Metoda statyczna: digit\n");
        out.println("static int digit(int ch, int radix)");
        out.println("Returns the numeric value of the character ch in the specified radix.");
                out.println();
 /* Przykładowa tablica znaków */
        char znak[] = {'E', 'u', 'r', 'o', ' ', '2', '0', '1', '2'};
 /* Demonstracja działania metody */
        out.println("Wartość znaku jako cyfry w układzie dziesiątkowym (radix = 10)");
        for(char z : znak)
            out.println("Znak: "+z+" Cyfra: "+ Character.digit(z, 10));
        out.println("Uwaga: -1 oznacza, że znak nie jest cyfrą w tym układzie liczbowym.");
                out.println();
        out.println("Wartość znaku jako cyfry w układzie szesnastkowym (radix = 16)");
        for(char z : znak)
            out.println("Znak: "+z+" Cyfra: "+Character.digit(z, 16));
        out.println("Uwaga: -1 oznacza, że znak nie jest cyfrą w tym układzie liczbowym.");
    }
}

