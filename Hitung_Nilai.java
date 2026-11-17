
public class Hitung_Nilai {

    public static void main(String[] args) {
        int Nilai = 50;
        char Grade;

        if (Nilai >= 90 && Nilai <= 100) {
            Grade = 'A';
        } else if (Nilai >= 81 && Nilai < 90) {
            Grade = 'B';
        } else if (Nilai >= 71 && Nilai < 81) {
            Grade = 'C';
        } else if (Nilai >= 61 && Nilai < 71) {
            Grade = 'D';
        } else {
            Grade = 'E';
        }

        System.out.println("Nilai=" + Nilai);
        System.out.println("Grade Anda=" + Grade);
    }
}
