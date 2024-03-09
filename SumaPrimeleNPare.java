import java.util.Scanner;

public class SumaPrimeleNPare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();

        int suma = calculareSumaPrime(n);
        System.out.println("Suma primelor " + n + " numere pare este: " + suma);

        scanner.close();
    }

    private static int calculareSumaPrime(int n) {
        int suma = 0;
        int numar = 2;

        for (int i = 0; i < n; i++) {
           suma = suma + numar;
           numar = numar + 2; 
        }

        return suma;
    }
}

