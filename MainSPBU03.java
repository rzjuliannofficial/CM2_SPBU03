import java.util.Scanner;

public class MainSPBU03 {
    public static void main(String[] args) {
        AntrianSLL03 sll = new AntrianSLL03();
        AntrianLayananQueue03 queue = new AntrianLayananQueue03(50);
        Scanner sc03 = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n============= MENU SPBU  ============");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Check Jumlah Antrian");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("6. Urutkan Transaksi Berdasarkan Jumlah Liter");
            System.out.println("7. Urutkan Transaksi Berdasarkan Total Bayar");
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
                    System.out.print("Masukkan Warna: ");
                    String warna = sc03.nextLine();
                    Kendaraan03 kendaraan = new Kendaraan03(platNomor, tipe, merk, warna);
                    sll.add(kendaraan);
                }
                case 2 -> {
                    sll.print();
                }
                case 3 -> {
                    sll.getSize();
                }
                case 4 -> {
                   Kendaraan03 dilayani = sll.layani();
                    if (dilayani == null) {
                        System.out.println("Tidak ada kendaraan yang bisa dilayani.");
                        break;
                    } else if (queue.isFull()) {
                        System.out.println("Antrian layanan sudah penuh.");
                        break;
                    }
                    System.out.println("=== Layani Kendaraan ===");
                    System.out.println("Petugas Melayani "+ dilayani.platNomor);
                    System.out.print("Masukkan Jenis BBM: ");
                    String jenisBBM = sc03.nextLine();
                    System.out.print("Masukkan Harga per Liter: ");
                    double hargaPerLiter = sc03.nextDouble();
                    System.out.print("Masukkan Jumlah Liter: ");
                    double liter = sc03.nextDouble();
                    sc03.nextLine();
                    queue.enqueue(new TransaksiPengisian03(dilayani, new BBM03(jenisBBM, hargaPerLiter), liter));
                    System.out.println("Transaksi berhasil ditambahkan ke antrian layanan.");
                }
                case 5 -> {
                    if (queue.isEmpty()) {
                        System.out.println("Tidak ada transaksi yang tercatat.");
                        break;
                    }
                    System.out.println("=== Riwayat Transaksi Pengisian BBM ===");
                    queue.printRiwayatTransaksi();
                }
                case 6 -> {
                    if (queue.isEmpty()) {
                        System.out.println("Tidak ada transaksi yang tercatat untuk diurutkan.");
                        break;
                    }
                        queue.sorting();
                        queue.printRiwayatTransaksi(); // Menampilkan transaksi setelah diurutkan
                    }
                case 7 -> {
                    if (queue.isEmpty()) {
                        System.out.println("Tidak ada transaksi yang tercatat untuk diurutkan.");
                        break;
                    }
                        queue.sortingTotal();
                        queue.printRiwayatTransaksi(); // Menampilkan transaksi setelah diurutkan
                    }

                case 0 -> {
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    sc03.close();
                }
                default -> {
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                }
            }
        } while (pilihan != 0);
        System.out.println();
    }
}