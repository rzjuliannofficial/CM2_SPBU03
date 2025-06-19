public class Kendaraan03 {
    String platNomor;
    String tipe;
    String merk;
    String warna;
    
    public Kendaraan03(String platNomor, String tipe, String merk, String warna) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
        this.warna = warna;
    }

    public void tampilkanInformasi() {
        System.out.printf("%-15s %-15s %-15s %-15s\n", platNomor, tipe, merk, warna);
    }
}
