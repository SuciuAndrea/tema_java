import java.util.Scanner;

public class AfisareNumarInLitere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        if (numar >= 1 && numar <= 5) {
            String numeNumar = convertesteInLitere(numar);
            System.out.println(numeNumar);
        } else {
            System.out.println("INVALID");
        }

        scanner.close();
    }

    private static String convertesteInLitere(int numar) {
        switch (numar) {
            case 1:
                return "UNU";
            case 2:
                return "DOI";
            case 3:
                return "TREI";
            case 4:
                return "PATRU";
            case 5:
                return "CINCI";
            default:
                return "";
        }
    }
}

