import java.util.Scanner;

public class CifraMaxima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        int cifraMaxima = gasesteCifraMaxima(numar);
        System.out.println("Cifra maxima a numarului este: " + cifraMaxima);

        scanner.close();
    }

    private static int gasesteCifraMaxima(int numar) {
        int cifraMaxima = 0;

        String numarString = Integer.toString(numar);

        for (int i = 0; i < numarString.length(); i++) {
            int cifra = Character.getNumericValue(numarString.charAt(i));
            if (cifra > cifraMaxima) {
                cifraMaxima = cifra;
            }
        }

        return cifraMaxima;
    }
}

