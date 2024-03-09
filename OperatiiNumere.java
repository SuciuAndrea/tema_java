import java.util.Scanner;

public class OperatiiNumere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();

        if (estePar(numar1) && estePar(numar2)) {
            double media = calculMedieAritmetica(numar1, numar2);
            System.out.println("Media aritmetica: " + media);
        } else if (esteImpar(numar1) && esteImpar(numar2)) {
            int produs = calculProdus(numar1, numar2);
            System.out.println("Produsul numerelor impare: " + produs);
        } else {
            int suma = calculSuma(numar1, numar2);
            System.out.println("Suma numerelor: " + suma);
        }

        scanner.close();
    }

    private static boolean estePar(int numar) {
        return numar % 2 == 0;
    }

    private static boolean esteImpar(int numar) {
        return numar % 2 != 0;
    }

    private static double calculMedieAritmetica(int numar1, int numar2) {
        return (numar1 + numar2) / 2.0;
    }

    private static int calculProdus(int numar1, int numar2) {
        return numar1 * numar2;
    }

    private static int calculSuma(int numar1, int numar2) {
        return numar1 + numar2;
    }
}
