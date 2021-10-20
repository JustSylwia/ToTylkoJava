import java.util.Scanner;

public class Wiek {
    public static void main(String[] args) {
        System.out.print("Podaj wiek: ");
        int wiek = new Scanner(System.in).nextInt();

        if (wiek < 0) return;
        if (wiek > 100) return;

        if (wiek < 18) {
            System.out.println("Człowiek jest dzieckiem");
        } else if (wiek < 40) {
            System.out.println("Człowiek jest młody");
        } else if (wiek < 65) {
            System.out.println("Człowiek jest w średnim wieku");
        } else if (wiek <= 100) {
            System.out.println("Człowiek jest stary");
        }
    }
}


