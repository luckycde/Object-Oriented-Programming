// (2520097)

public class Bil_Genap {

    public static void main(String[] args) {

        System.out.println("Bilangan Genap 1 sampai 100 menggunakan for loop\n");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n---------------------=---------------------\n");

        System.out.println("Bilangan Genap 1 sampai 100 menggunakan while loop\n");
        int i = 2;

        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
