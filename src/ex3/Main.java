package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente contoCorrente = new ContoCorrente("Arianna", 1500);
        ContoOnline contoOnline = new ContoOnline("Arianna", 800, 600);

        boolean continua = true;

        while (continua) {
            try {
                System.out.println("Effettua un prelievo dal conto corrente:");
                double importo = scanner.nextDouble();
                contoCorrente.preleva(importo);
                System.out.println("Saldo conto corrente: " + contoCorrente.restituisciSaldo());

                System.out.println("Effettua un prelievo dal conto online:");
                importo = scanner.nextDouble();
                contoOnline.preleva(importo);
                contoOnline.stampaSaldo();
            } catch (BancaException e) {
                System.out.println("Errore: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Errore inatteso: " + e.getMessage());
            }

            System.out.println("Vuoi continuare? (Y/N)");
            String risposta = scanner.next();
            if (!risposta.equalsIgnoreCase("Y")) {
                continua = false;
            }
        }

        scanner.close();
    }
}
