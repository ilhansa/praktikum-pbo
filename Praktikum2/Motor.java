package Praktikum2;

public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Mesin off kecepatan 0");
        } else if (this.statusMesin && kecepatan >= 100) {
            System.out.println("Kecepatan tidak boleh lebih dari 100");
        } else if (this.statusMesin && kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh negatif");
        } 
        else {
            this.kecepatan = kecepatan;
        }
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public boolean getStatusMesin() {
        return statusMesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    
    public void displayInfo() {
        System.out.println("Plat nomor: " + this.platNomor);
        System.out.println("Status mesin: " + (this.statusMesin ? "On":"Off"));
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("===================");
    }
}
