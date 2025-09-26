package Praktikum3;

public class RestoranMain {
    public static void main(String[] args) {
        Menu nasgor = new Menu("1", "Nasi Goreng", 15000);
        Menu esTeh = new Menu("2", "Es Teh", 5000);
        Menu mieGoreng = new Menu("3", "Mie Goreng", 10000);
        Pelanggan pelanggan1 = new Pelanggan(1, "Ilhan");
        Pelanggan pelanggan2 = new Pelanggan(2, "Salih");

        pelanggan1.pesan(mieGoreng);
        pelanggan1.pesan(nasgor);
        pelanggan1.pesan(esTeh);
        pelanggan1.lihatPesanan();

        pelanggan2.pesan(nasgor);
        pelanggan2.pesan(nasgor);
        pelanggan2.pesan(esTeh);
        pelanggan2.hapusPesanan(nasgor);
        pelanggan2.lihatPesanan();
    }
}
