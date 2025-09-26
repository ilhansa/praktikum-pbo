package Praktikum3;

public class RumahSakit {
    private String nip;
    private String nama;

    RumahSakit(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getInfo() {
        return nama + "(" + nip + ")";
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


}
