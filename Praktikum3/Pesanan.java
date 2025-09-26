package Praktikum3;

import java.util.ArrayList;

public class Pesanan {
    private int no;
    private double totalHarga;
    private ArrayList<Menu> daftarMenu;

    Pesanan(int no) {
        this.no = no;
        daftarMenu = new ArrayList<Menu>();
    }

    public void tampilInfo() {
        System.out.println("Pesanan " + no);
        for (Menu menu : daftarMenu) {
            menu.tampilInfo();
        }
    }

    public double hitungTotalHarga() {
        if (!daftarMenu.isEmpty()) {
            for (Menu menu : daftarMenu) {
               totalHarga += menu.getHarga();
            }        
        } else {
            System.out.println("Pesan terlebih dahulu");
        }
        return totalHarga;
    }

    public void pesanMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void hapusMenu(Menu menu) {
        daftarMenu.remove(menu);
    }
}
