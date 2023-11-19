
public abstract class BaseData {
    public String nama;
    public String jenis_kelamin;
    public String tanggal_lahir;
    public String no_hp;

    public void bayar_parkir() {
        System.out.println("Status Bayar parkir");
    }

    public abstract void harga_parkir();

}