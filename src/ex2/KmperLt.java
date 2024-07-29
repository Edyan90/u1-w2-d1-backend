package ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KmperLt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* try {
            System.out.print("Inserisci il numero di km percorsi: ");
            int km = scanner.nextInt();

            System.out.print("Inserisci il numero di litri di carburante consumati: ");
            int litri = scanner.nextInt();

            if (litri == 0) {
                throw new ArithmeticException("Divisione per zero non consentita.");
            }

            int kmPerLitro = km / litri;
            System.out.println("Hai percorso " + kmPerLitro + " km per litro.");

        } catch (InputMismatchException e) {
            System.out.println("Errore: Inserisci un valore numerico valido.");
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }*/
        try {
            System.out.print("Inserisci il numero di km percorsi: ");
            double km = scanner.nextDouble();

            System.out.print("Inserisci il numero di litri di carburante consumati: ");
            double litri = scanner.nextDouble();

            if (litri == 0.0) {
                throw new ArithmeticException("Divisione per zero non consentita.");
            }

            double kmPerLitro = km / litri;
            System.out.println("Hai percorso " + kmPerLitro + " km per litro.");

        } catch (InputMismatchException e) {
            System.out.println("Errore: Inserisci un valore numerico valido.");
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
