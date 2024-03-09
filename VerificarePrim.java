import java.util.Scanner;

public class VerificarePrim {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar (diferit de 0 sau 1): ");
        int n = scanner.nextInt();

        if (n != 0 && n != 1) {
            if (estePrim(n)) {
                System.out.println(n + " este un numar prim.");
            } else {
                System.out.println(n + " nu este un numar prim.");
            }
        } else {
            System.out.println("Numarul trebuie sa fie diferit de 0 sau 1.");
        }

       
        scanner.close();
    }

    private static boolean estePrim(int numar) {
        if (numar < 2) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
