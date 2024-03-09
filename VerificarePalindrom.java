import java.util.Scanner;

public class VerificarePalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        if (estePalindrom(numar)) {
            System.out.println(numar + " este un numar palindrom.");
        } else {
            System.out.println(numar + " nu este un numar palindrom.");
        }

        scanner.close();
    }

    private static boolean estePalindrom(int numar) {
        int original = numar;
        int invers = 0;

        while (numar != 0) {
            int cifra = numar % 10;  
            invers = invers * 10 + cifra; 
            numar /= 10;  
        }

       
        return original == invers;
    }
}

