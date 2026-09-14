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
        int ukuranByte = scanner.nextInt();

        System.out.println(namaFile + " - " + ukuranByte);

        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        System.out.println(ukuranKB + " KB");
        System.out.println(ukuranMB + " MB");
        System.out.println(ukuranGB + " GB");

    }
}