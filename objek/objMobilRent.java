package objek;
import java.util.Scanner;
import kelas.clsMobilRent;

public class objMobilRent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_MOBIL = 100; // Maksimum jumlah mobil yang bisa disimpan
        clsMobilRent[] listmobil = new clsMobilRent[MAX_MOBIL];

        // Memanggil method tambahMobil dari kelas clsMobilRent
        int jumlahmobil = clsMobilRent.tambahMobil(listmobil, input);

        // Menampilkan data mobil
        clsMobilRent.tampilkanData(listmobil, jumlahmobil);

        input.close();
    }
}
