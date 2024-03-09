import java.util.Scanner;

public class VerificarePrimDivizori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea lui n (diferita de 0 sau 1): ");
        int n = scanner.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("Numarul trebuie sa fie diferit de 0 sau 1.");
        } else {
            if (estePrim(n)) {
                System.out.println(n + " este un numar prim.");
            } else {
                System.out.println(n + " nu este un numar prim.");
            }

            System.out.println("Divizorii lui " + n + " sunt:");
            afisareDivizori(n);
        }

        scanner.close();
    }

    private static boolean estePrim(int numar) {
        if (numar <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void afisareDivizori(int numar) {
        for (int i = 1; i <= numar; i++) {
            if (numar % i == 0) {
                System.out.println(i);
            }
        }
    }
}

