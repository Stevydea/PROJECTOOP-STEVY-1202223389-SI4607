
import java.util.Scanner;

public class DataPasien extends BaseData {
    public String jenis_penyakit;

    @Override
    public void harga_parkir() {
        Scanner input = new Scanner(System.in);

        System.out.print("Jam Parkir : ");
        Integer waktu = input.nextInt();

        double Hargaparkir = (3000 * waktu);
        System.out.println("Harga parkir anda Rp." + Hargaparkir);

        input.close();
    }
}
