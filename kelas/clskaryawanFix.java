package kelas;
import java.util.Scanner;

public class clskaryawanFix {
    private String name, address,id,email, gender, category;
    private Long phone;

    public clskaryawanFix(String name, String address,String id, String email, Long phone, String gender, String category) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.category = category;
    }

    public void displayMessage() {
        System.out.println("Nama\t\t : " + name);
        System.out.println("Alamat\t\t : " + address);
        System.out.println("Jenis Kelamin\t : " + gender);
        System.out.println("ID\t\t : " + id);
        System.out.println("Email\t\t : " + email);
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

            System.out.print("Masukkan ID Karyawan\t\t: ");
            String id = input.nextLine();

            System.out.print("Masukkan Email Karyawan\t\t: ");
            String email = input.nextLine();

            System.out.print("Masukkan No. HP Karyawan\t: ");
            long phoneNumber = input.nextLong();

            String gender = "";
            boolean cekGender = false;
            while (!cekGender) {
                System.out.print("Masukkan Jenis Kelamin Karyawan ('L' untuk Laki - Laki, 'P' untuk Perempuan ): ");
                gender = input.nextLine().toLowerCase();
                if (gender.equals("l") || gender.equals("p")) {
                cekGender = true;
                switch (gender) {
                    case "l":
                        gender = "Laki - Laki";
                        break;
                    case "p":
                        gender = "Perempuan";
                        break;
                    default:
                        // Penanganan input yang tidak valid
                        System.out.println("Jenis Kelamin karyawan tidak valid. Harap masukkan 'L' atau 'P'.");
                        break;
                     }
                 } else {
                // Menampilkan pesan error karena input tidak valid
                System.out.println("Jenis Kelamin karyawan tidak valid. Harap masukkan 'L' atau 'P'.");
                }
            }
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

            clskaryawanFix employee = new clskaryawanFix(name, address, id, email, phoneNumber, gender, employeeCategory);
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