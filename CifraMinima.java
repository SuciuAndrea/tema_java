import java.util.Scanner;

public class CifraMinima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        int cifraMinima = gasesteCifraMinima(numar);
        System.out.println("Cifra minima a numarului este: " + cifraMinima);

        scanner.close();
    }

    private static int gasesteCifraMinima(int numar) {
        int cifraMinima = 9;

        String numarString = Integer.toString(numar);

        for (int i = 0; i < numarString.length(); i++) {
            int cifra = Character.getNumericValue(numarString.charAt(i));
            if (cifra < cifraMinima) {
                cifraMinima = cifra;
            }
        }

        return cifraMinima;
    }
}

