package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nuovoArray = new int[5];
        for (int i = 0; i < 5; i++) {
            nuovoArray[i] = (int) Math.floor(Math.random() * 10);
            System.out.println(nuovoArray[i]);
        }
        System.out.println("array iniziale: ");
        printArray(nuovoArray);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Inserisci la posizione (1-5) dove vuoi inserire un numero (0 per uscire): ");
                int posizione = scanner.nextInt() - 1;

                if (posizione == -1) {
                    System.out.print("uscita dal programma");
                    break;
                }
                System.out.print("Inserisci il numero da inserire nella posizione " + (posizione + 1) + ": ");
                int numero = scanner.nextInt();
                if (posizione < 0 || posizione >= nuovoArray.length) {
                    System.out.println("Posizione non valida. Per favore inserisci una posizione tra 1 e 5.");
                } else {
                    nuovoArray[posizione] = numero;
                    System.out.println("Nuovo stato dell'array dopo l'inserimento richiesto:");
                    printArray(nuovoArray);
                }
            } catch (Exception e) {
                System.out.println("Errore: inserimento non valido. Per favore, riprova.");
                scanner.next();
            }
        }
        scanner.close();

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}