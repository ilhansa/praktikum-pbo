package Praktikum3;
public class Pegawai {
    private String id;
    private String nama;

    Pegawai(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getInfo() {
        String info = "";
        info += "Id: " + id + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
