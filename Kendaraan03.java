public class Kendaraan03 {
    String platNomor;
    String tipe;
    String merk;

    public Kendaraan03(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInformasi() {
        System.out.printf("%-15s %-15s %-15s\n", platNomor, tipe, merk);
    }
}
