package Praktikum2;

public class AnggotaKoperasi {
    private String nomorKtp;
    private String nama;
    private int limitPeminjaman;
    private int pinjaman;

    public AnggotaKoperasi(String nomorKtp, String nama, int limitPeminjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public void pinjam(int jumlahPinjam) {
        if (jumlahPinjam > this.limitPeminjaman) {
            System.out.println("Melebihi limit peminjaman");
        }
        this.pinjaman = jumlahPinjam;
    }

    public void angsur(int jumlahAngsur) {
        double minAngsur = pinjaman * 0.1;
        if (jumlahAngsur < 0 || jumlahAngsur <= minAngsur) {
            System.out.println("Jumlah angsuran kurang");
        } else {
            this.pinjaman -= jumlahAngsur;
        }
    }

    public String getNama() {
        return nama;
    }

    public int getPinjaman() {
        return pinjaman;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }
}