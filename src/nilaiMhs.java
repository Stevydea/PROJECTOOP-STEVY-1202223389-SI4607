import java.util.Scanner;

public class nilaiMhs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("NIM :");
        String nim = input.nextLine();

        System.out.print("Nilai Tubes :");
        double nilaiTubes = input.nextDouble();

        System.out.print("Nilai Quiz :");
        double nilaiQuiz = input.nextDouble();

        System.out.print("Nilai Tugas :");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS :");
        double nilaiUts = input.nextDouble();

        System.out.print("Nilai UAS :");
        double nilaiUas = input.nextDouble();

        // Menghitung total nilai
        double Totalnilai = (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUts)
                + (0.25 * nilaiUas);

        System.out.println("\nNilai Matakuliah Pemograman Berorientasi Objek ");
        System.out.println("Nama   :" + nama);
        System.out.println("NIM    :" + nim);
        System.out.println("Total Nilai Matakuliah Pemograman Berorientasi Objek: " + Totalnilai);

        input.close();
    }
}
