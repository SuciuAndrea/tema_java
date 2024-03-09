
import java.util.Scanner;

public class VerificareNumar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        if (numar > 5) {
            System.out.println("ADMIS");
        } else if (numar >= 1 && numar <= 10) {
            System.out.println("RESPINS");
        } else {
            System.out.println("INVALID");
        }

        scanner.close();
    }
}
