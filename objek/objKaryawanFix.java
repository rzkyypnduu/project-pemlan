package objek;
import kelas.clskaryawanFix;
import java.util.*;

public class objKaryawanFix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_KARYAWAN = 100; // Maksimum jumlah karyawan yang bisa disimpan
        clskaryawanFix[] listKaryawan = new clskaryawanFix[MAX_KARYAWAN];

        // Memanggil method tambahKaryawan dari kelas clskaryawanFix
        int jumlahKaryawan = clskaryawanFix.tambahKaryawan(listKaryawan, input);

        // Menampilkan data karyawan
        clskaryawanFix.tampilkanData(listKaryawan, jumlahKaryawan);

        input.close();
    }
}