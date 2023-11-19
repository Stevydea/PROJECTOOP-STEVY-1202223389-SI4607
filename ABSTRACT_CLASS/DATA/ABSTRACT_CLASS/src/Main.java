
public class Main {
    public static void main(String[] args) {
        Datadokter orang_kedua = new Datadokter();
        orang_kedua.nama = "stevy";
        orang_kedua.nomor_dokter = "1202223389";
        orang_kedua.bagian = "penyakit dalam";
        orang_kedua.bayar_parkir();
        orang_kedua.harga_parkir();

        DataPasien orang_pertama = new DataPasien();
        orang_pertama.nama = "Dea";
        orang_pertama.jenis_kelamin = "Perempuan";
        orang_pertama.tanggal_lahir = "3 jan 2021";
        orang_pertama.no_hp = "093264683";
        orang_pertama.jenis_penyakit = "sakit kepala";
        orang_pertama.bayar_parkir();
        orang_pertama.harga_parkir();

    }
}
