package InsertionSort;

import javax.swing.*;

public class InsertionSort_Lösung {

    public static void main(String[] args) {

        //Eingabe

        String s = JOptionPane.showInputDialog("Geben Sie Anzahl der Elemente ein: ");
        int zahl = Integer.parseInt(s);

        int[] reihe = new int[zahl];

        for (int i = 0; i < zahl; i++) {
            String eingabe = JOptionPane.showInputDialog("Geben Sie " + (i + 1) + " Element ein ");
            int y = Integer.parseInt(eingabe);

            reihe[i] = y;
        }

        // Anzeige ungeordnete Elemente
        System.out.println("ungeordnete Elemente: ");

        for (int i = 0; i < zahl; i++) {

            System.out.print(reihe[i] + "  |  ");

        }
        System.out.println();

        //Insert Sort

        System.out.println("Zwischenschritte");
        for (int i = 1; i < zahl; i++) {
            int temp = reihe[i];
            int j = i;
            while (j > 0 && reihe[j - 1] > temp) {
                reihe[j] = reihe[j - 1];
                j--;
            }

            reihe[j] = temp;

            for (int k = 0; k < zahl; k++) {
                System.out.print(reihe[k] + "  |  ");
            }

            System.out.println();

        }


        //Anzeigen geordnete Elemente
        System.out.println("geordnete Elemente: ");
        for (int x = 0; x < zahl; x++) {

            System.out.print(reihe[x] + "  |  ");

        }

    }
}
