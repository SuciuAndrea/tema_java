import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();

        long factorial = calculareFactorial(n);
        System.out.println("Factorialul lui " + n + " este: " + factorial);

        scanner.close();
    }

    private static long calculareFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorialul nu este definit pentru numere negative.");
            return -1; 
        }   else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}

