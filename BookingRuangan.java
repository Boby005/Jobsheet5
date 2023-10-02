import java.util.Scanner;

public class BookingRuangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabel untuk menyimpan informasi ruangan
        String namaRuangan;
        int kapasitasRuangan;
        double hargaPerJam;

        // Meminta pengguna untuk mengisi informasi ruangan

        System.out.print("Masukkan nama ruangan: ");
        namaRuangan = input.nextLine();

        System.out.print("Masukkan kapasitas ruangan: ");
        kapasitasRuangan = input.nextInt();

        System.out.print("Masukkan harga per jam: ");
        hargaPerJam = input.nextDouble();

        // Meminta pengguna untuk memasukkan waktu booking
        System.out.print("Masukkan jumlah jam yang ingin dipesan: ");
        double jumlahJam = input.nextDouble();

        // Meminta pengguna untuk memasukan tanggal booking
        System.out.print("Masukan Tanggal Pemesanan: ");
        int tanggal = input.nextInt();

        String JenisTanggal = (tanggal % 2 == 0) ?"genap" : "ganjil";
        System.out.println("Tanggal " + tanggal + " adalah tanggal " + JenisTanggal + ".");
        input.close();

        // Menghitung total harga
        double totalHarga = hargaPerJam * jumlahJam;

        // Menampilkan output
        System.out.println("\nBooking Ruangan:");
        System.out.println("Nama Ruangan: " + namaRuangan);
        System.out.println("Kapasitas Ruangan: " + kapasitasRuangan + " orang");
        System.out.println("Harga per Jam: $" + hargaPerJam);
        System.out.println("Jumlah Jam yang Dipesan: " + jumlahJam + " jam");
        System.out.println("Total Harga: $" + totalHarga);

        // Menutup scanner
        input.close();
    }
}