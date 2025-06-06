import java.util.Scanner;

public class MainSPBU03 {
    public static void main(String[] args) {
        AntrianSLL03 sll = new AntrianSLL03();
        Scanner sc03 = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n============= MENU SPBU  ============");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Check Jumlah Antrian");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.println("======================================");
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan = sc03.nextInt();
            sc03.nextLine();
            System.out.println();
            switch (pilihan){
                case 1 -> {
                    System.out.println("=== Tambah Antrian Kendaraan ===");
                    System.out.print("Masukkan Plat Nomor: ");
                    String platNomor = sc03.nextLine();
                    System.out.print("Masukkan Tipe Kendaraan: ");
                    String tipe = sc03.nextLine();
                    System.out.print("Masukkan Merk Kendaraan: ");
                    String merk = sc03.nextLine();
                    Kendaraan03 kendaraan = new Kendaraan03(platNomor, tipe, merk);
                    sll.add(kendaraan);
                }
                case 2 -> {
                    
                }
                case 3 -> {
                    
                }
                case 4 -> {
                   
                }
                case 5 -> {
                    
                }
                case 0 -> {
                    
                }
                default -> {
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                }
            }
        } while (pilihan != 0);
        System.out.println();
    }
}