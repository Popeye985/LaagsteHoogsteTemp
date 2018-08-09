package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinMax mm = new MinMax();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Geef temperatuur om %d uur: ", i*2 + 6);
            int temperatuur = Integer.parseInt(scanner.nextLine());
            mm.registreerTemperatuur(temperatuur);
        }
        System.out.printf("De minimumtemperatuur was %d%n", mm.getMinimumTemperatuur());
        System.out.printf("De maximumtemperatuur was %d%n", mm.getMaximumTemperatuur());
	// write your code here
    }
}
