package kelas;
import java.util.Scanner;

public class clsMobilRent {
    private String noPlat, merkMobil, warnaMobil, tahunKeluaran, penyewa;

    public clsMobilRent(String noPlat, String merkMobil, String warnaMobil, String tahunKeluaran, String penyewa) {
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaran = tahunKeluaran;
        this.penyewa = penyewa;
    }

    public void displayMessage() {
        System.out.println("No Plat\t\t : " + noPlat);
        System.out.println("Merk Mobil\t : " + merkMobil);
        System.out.println("Warna Mobil\t : " + warnaMobil);
        System.out.println("Tahun Keluaran\t : " + tahunKeluaran);
        System.out.println("Nama Penyewa\t : " + penyewa );
        System.out.println("-----------------------------");
    }

    public static int tambahMobil(clsMobilRent[] listMobil, Scanner input) {
        int index = 0;
        String x = "";
        do {
            System.out.print("Masukkan No Plat Mobil\t\t: ");
            String noPlat = input.nextLine();

            System.out.print("Masukkan merk Mobil\t: ");
            String merkMobil = input.nextLine();

            System.out.print("Masukkan warna Mobil\t\t: ");
            String warnaMobil = input.nextLine();

            System.out.print("Masukkan Tahun Keluaran Mobil\t: ");
            String tahunKeluaran = input.nextLine();

            System.out.print("Masukkan nama Penyewa\t\t: ");
            String penyewa = input.nextLine();

            clsMobilRent Mobil = new clsMobilRent(noPlat, merkMobil, warnaMobil, tahunKeluaran, penyewa);
            listMobil[index] = Mobil;
            index++;

            System.out.print("Anda Menambahkan mobil lagi ? (ya/tidak): ");
            x = input.nextLine().toLowerCase();
        } while (x.contains("y"));
        return index; // Mengembalikan jumlah karyawan yang telah ditambahkan
    }

    public static void tampilkanData(clsMobilRent[] listMobil, int jumlahMobil) {
        System.out.println("\nData Mobil:\n" + "-----------------------------");
        for (int i = 0; i < jumlahMobil; i++) {
            listMobil[i].displayMessage();
        }
    }
}