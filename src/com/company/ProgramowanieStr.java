package com.company;

/**
 * Created by Piot on 08.01.2017.
 */
public class ProgramowanieStr {
    public static void main(String args[]) {
        String programowanie = "programowanie";
        char[] programowanie2 = new char[programowanie.length()];
        System.out.println(programowanie.replace("p", "P"));
        System.out.println(programowanie.toUpperCase());

        for (int i = 0; i < programowanie.length(); i++) {
            System.out.print(programowanie.charAt(programowanie.length()-i-1));
            programowanie2[i] = programowanie.charAt(programowanie.length()-i-1);
        }
        System.out.println();
        String nowy = new String(programowanie2);
        System.out.println(nowy);
    }
}
