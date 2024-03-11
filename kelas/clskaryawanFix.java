package kelas;
import java.util.Scanner;

public class clskaryawanFix {
    private String name, address, phone, gender, category;

    public clskaryawanFix(String name, String address, String phone, String gender, String category) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.category = category;
    }

    public void displayMessage() {
        System.out.println("Nama\t\t : " + name);
        System.out.println("Alamat\t\t : " + address);
        System.out.println("Jenis Kelamin\t : " + gender);
        System.out.println("No. HP\t\t : " + phone);
        System.out.println("Kategori Karyawan: " + category);
        System.out.println("-----------------------------");
    }

    public static int tambahKaryawan(clskaryawanFix[] listKaryawan, Scanner input) {
        int index = 0;
        String x = "";
        do {
            System.out.print("Masukkan Nama Karyawan\t\t: ");
            String name = input.nextLine();

            System.out.print("Masukkan Alamat Karyawan\t: ");
            String address = input.nextLine();

            System.out.print("Masukkan No. HP Karyawan\t: ");
            String phoneNumber = input.nextLine();

            System.out.print("Masukkan Jenis Kelamin Karyawan\t: ");
            String gender = input.nextLine();

            String employeeCategory = "";
            boolean cekKategori = false;
            while (!cekKategori) {
                System.out.print("Masukkan Kategori Karyawan ('travel' untuk Supir Travel, 'rent' untuk Supir Rental, 'admin' untuk staff admin ): ");
                employeeCategory = input.nextLine().toLowerCase();
                if (employeeCategory.equals("travel") || employeeCategory.equals("rent") || employeeCategory.equals("admin")) {
                    cekKategori = true;
                } else {
                    System.out.println("Kategori karyawan tidak valid. Harap masukkan 'travel', 'rent', atau 'admin'.");
                }
            }

            clskaryawanFix employee = new clskaryawanFix(name, address, phoneNumber, gender, employeeCategory);
            listKaryawan[index] = employee;
            index++;

            System.out.print("Anda Menambahkan data lagi ? (ya/tidak): ");
            x = input.nextLine().toLowerCase();
        } while (x.contains("y"));
        return index; // Mengembalikan jumlah karyawan yang telah ditambahkan
    }

    public static void tampilkanData(clskaryawanFix[] listKaryawan, int jumlahKaryawan) {
        System.out.println("\nData Karyawan:\n" + "-----------------------------");
        for (int i = 0; i < jumlahKaryawan; i++) {
            listKaryawan[i].displayMessage();
        }
    }
}