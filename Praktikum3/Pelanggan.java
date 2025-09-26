package Praktikum3;

public class Pelanggan {
    private int id;
    private String nama;
    private Pesanan pesanan;

    Pelanggan(int id, String nama) {
        this.id = id;
        this.nama = nama;
        pesanan = new Pesanan(id);
    }

    public void pesan(Menu menu) {
        pesanan.pesanMenu(menu);
    }

    public void hapusPesanan(Menu menu) {
        pesanan.hapusMenu(menu);
    } 

    public void lihatPesanan() {
        System.out.println("Pesanan nomor: " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Menu yang dipesan");
        pesanan.tampilInfo();
        System.out.println("Total harga: " + pesanan.hitungTotalHarga());
        System.out.println("==================");
    }
}
