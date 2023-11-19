
public class Datadokter extends BaseData {
    public String nomor_dokter;
    public String bagian;

    @Override
    public void harga_parkir() {
        System.out.println("Dokter tidak perlu membayar parkir");
    }
}
