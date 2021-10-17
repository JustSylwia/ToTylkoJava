public class Wiek {
    public static void main(String[] args) {
        int Wiek =35;

        if (Wiek < 0) return;
        if (Wiek > 100) return;

        if (Wiek < 18) {
            System.out.println("Człowiek jest dzieckiem");
        } else if (Wiek < 40) {
            System.out.println("Człowiek jest młody");
        } else if (Wiek < 65) {
            System.out.println("Człowiek jest w średnim wieku");
        } else if (Wiek <= 100) {
            System.out.println("Człowiek jest stary");
        }


    }
}


