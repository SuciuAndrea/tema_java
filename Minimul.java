import java.util.Scanner;

public class Minimul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();

        System.out.print("Introduceti al treilea numar: ");
        int numar3 = scanner.nextInt();

        int minim = gasesteMinimul(numar1, numar2, numar3);
        System.out.println("Valoarea minima dintre cele trei numere este: " + minim);

        scanner.close();
    }

    private static int gasesteMinimul(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}

