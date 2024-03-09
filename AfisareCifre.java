public import java.util.Scanner;

public class AfișareCifre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        afisareCifre(numar);

        scanner.close();
    }

    private static void afisareCifre(int numar) {
        System.out.println("Cifrele numarului sunt:");

        String numarString = Integer.toString(numar);

        for (int i = 0; i < numarString.length(); i++) {
            char cifra = numarString.charAt(i);
            System.out.println(cifra);
        }
    }
