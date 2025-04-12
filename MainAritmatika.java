import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner untuk input dari user
        Aritmatika arit = new Aritmatika(); // Membuat objek untuk method non-static

        // Input angka pertama
        System.out.print("Masukkan nilai 1: ");
        int a = input.nextInt();
        // Input angka kedua
        System.out.print("Masukkan nilai 2: ");
        int b = input.nextInt();

        // Pemanggilan method static penjumlahan dan pengurangan
        Aritmatika.penjumlahan(a, b);
        Aritmatika.pengurangan(a, b);

        // Pemanggilan method non-static
        arit.perkalian(a, b);
        arit.pembagian(a, b);

        // Input untuk pecahan
        System.out.print("Masukkan pembilang: ");
        int pembilang = input.nextInt();
        System.out.print("Masukkan penyebut: ");
        int penyebut = input.nextInt();

        // Menyederhanakan pecahan
        arit.sederhana(pembilang, penyebut);
    }
}
