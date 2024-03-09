import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Introduceti numarul " + (i + 1) + ": ");
            int numar = scanner.nextInt();
            suma = suma + numar;
        }

        double media = calculareMediaAritmetica(n, suma);
        System.out.println("Media aritmetica a " + n + " numere este: " + media);

        scanner.close();
    }

    private static double calculareMediaAritmetica(int n, int suma) {
        return (double) suma / n;
    }
}
