
public class hiung_nilai {

    public static void main(String[] args) {
        int Nilai = 50;
        char Grade;

        if (Nilai >= 85 && Nilai <= 100) {
            Grade = 'A';
        } else if (Nilai >= 75 && Nilai < 85) {
            Grade = 'B';
        } else if (Nilai >= 60 && Nilai < 75) {
            Grade = 'C';
        } else if (Nilai >= 35 && Nilai < 60) {
            Grade = 'D';
        } else {
            Grade = 'E';
        }

        System.out.println("Nilai=" + Nilai);
        System.out.println("Grade Anda=" + Grade);
    }
}
