package com.company;

/**
 * Created by Piotr on 26.12.2016.
 */
public class Digits {
    public static void main(String[] args) {
        char[] digits = new char[10];
        char[] hexDigits = new char[16];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = (char) (48 + i);
        }
        System.out.println("Cyfry w systemie dzięsiętnym: ");
        System.out.println(digits);

        for (int i = 0; i <hexDigits.length ; i++) {
            hexDigits[i] = Character.forDigit(i, 16);
            hexDigits[i] = Character.toUpperCase(hexDigits[i]);
        }
        System.out.println("Cyfry w systemie szesnastkowym: ");
        System.out.println(hexDigits);
    }
}