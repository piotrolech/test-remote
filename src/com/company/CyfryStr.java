package com.company;

/**
 * Created by Piot on 08.01.2017.
 */
public class CyfryStr {
    public static void main(String args[]) {
        String cyfry = "";
        for (int i = 0; i < 10; i++) {
            cyfry = cyfry + (char) (i + 48);
        }
            System.out.println("Cyfry układu dziesiątkowego: " + cyfry);
    }
}
