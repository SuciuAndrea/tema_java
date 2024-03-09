import java.util.Scanner;

public class InversulNumarului {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        int invers = calculeazaInversul(numar);
        System.out.println("Inversul numarului este: " + invers);

        scanner.close();
    }

    private static int calculeazaInversul(int numar) {
        int invers = 0;

        while (numar != 0) {
            int cifra = numar % 10;  
            invers = invers * 10 + cifra;  
            numar /= 10;  
        }

        return invers;
    }
}

