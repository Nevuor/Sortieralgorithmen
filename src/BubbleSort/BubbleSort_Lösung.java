package BubbleSort;

import javax.swing.*;

public class BubbleSort_Lösung {

    public static void main(String[] args) {

        // Bubblesort

        // Eingabe der Länge des Arrays "reihe"

        String s = JOptionPane.showInputDialog("Geben Sie Anzahl der Elemente ein: ");
        int zahl = Integer.parseInt(s);
        int[] reihe = new int[zahl];

        // Eingabe der Elemente für das Array "reihe"

        for (int i = 0; i < zahl; i++) {
            String eingabe = JOptionPane.showInputDialog("Geben Sie " + (i + 1) + " Element ein ");
            int y = Integer.parseInt(eingabe);
            reihe[i] = y;
        }

        // Anzeige ungeordnete Elemente

        System.out.println("ungeordnete Elemente: ");
        for (int i = 0; i < zahl; i++) {
            System.out.print(" " + reihe[i] + " ");
        }
        System.out.println();

        // Sortierung des Arrays mit Bubblesort

        int temp;
        boolean getauscht;
        int i = 1;

        // for Schleife
        do {
            getauscht = false;
            for (int j = 0; j < reihe.length - i; j++) {
                if (reihe[j] > reihe[j + 1]) {
                    temp = reihe[j];
                    reihe[j] = reihe[j + 1];
                    reihe[j + 1] = temp;
                    getauscht = true;
                }
            }
            i++;
        } while (getauscht == true);

        // Ausgabe des sortierten Arrays

        System.out.println(" geordnete Elemente: ");
        for (int x = 0; x < zahl; x++) {
            System.out.print(" " + reihe[x] + " ");
        }
    }
}
