import java.util.Scanner;

public class UkuranFile {

    static final double SATU_KB = 1024.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Percobaan pertama: ukuran file ditampung pakai int
        // int ukuranByte = scanner.nextInt();
        // hasil jadi negatif kalau dipaksa cast
        // 3 GB saja sudah 3.221.225.472 byte, jadi wajib pakai long.

        System.out.print("Nama file : ");
        String namaFile = scanner.nextLine();

        System.out.print("Ukuran (byte) : ");
        long ukuranByte = scanner.nextLong();

        System.out.println(namaFile + " - " + ukuranByte);

        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        // Konversi eksplisit double ke int, bukan dibiarkan Java menebak.
        // Yang hilang di sini adalah bagian desimalnya (dibuang, bukan dibulatkan
        // ke atas/bawah secara matematis) karena casting double ke int selalu
        // memotong, bukan membulatkan.

        int dibulatkanKeMB = (int) ukuranMB;
        double selisihPembulatan = ukuranMB - dibulatkanKeMB;

        System.out.println();
        System.out.println("===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println(ukuranByte + " byte");

        System.out.println(ukuranKB + " KB");
        System.out.println(ukuranMB + " MB");
        System.out.println(ukuranGB + " GB");

        System.out.println();
        System.out.println("Dibulatkan ke MB : " + dibulatkanKeMB);
        System.out.println("Selisih pembulatan: " + selisihPembulatan);

        scanner.close();
    }
}