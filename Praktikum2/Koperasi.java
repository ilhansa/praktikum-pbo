package Praktikum2;

public class Koperasi {
    public static void main(String[] args) {
        AnggotaKoperasi anggota1 = new AnggotaKoperasi
        ("1", "ilhan", 5000000);
        System.out.println("Nama anggota: " + anggota1.getNama());
        System.out.println("Limit pinjaman: " + anggota1.getLimitPeminjaman());

        System.out.println("Meminjam Rp 10.000.000");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getPinjaman());

        System.out.println("Meminjam Rp 4.000.000");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getPinjaman());

        System.out.println("Membayar angsuran Rp 100.000");
        anggota1.angsur(100000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getPinjaman());

        System.out.println("Membayar angsuran Rp 3.000.000");
        anggota1.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getPinjaman());
    }
}
